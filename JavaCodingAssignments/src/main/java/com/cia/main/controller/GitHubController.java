package com.cia.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cia.main.model.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping(value="/github")
public class GitHubController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/{username}/repos")
	public User allRepository(@PathVariable String username)  throws JsonParseException, JsonMappingException,
																 IOException
	{

		String url = "https://api.github.com/users/" + username + "/repos";

		List list = restTemplate.getForObject(url, List.class);

		User user = new User();
		if (list.isEmpty()) {
			System.out.println("not found");
		
		} else {
			user.setUserName(username);
			user.setRepoInfo(list);
			user.setCodeRepotype("github");
		}
		

		return user;

	}
	
	
	
	@RequestMapping(value = "/gitlab/{username}/projects")
	public User gitLabRepository(@PathVariable String username)  throws JsonParseException, JsonMappingException,
																 IOException
	{

		String url = "https://api.gitlab.com/users/" + username + "/project";
	
		System.out.println(url);
		List list = restTemplate.getForObject(url, List.class);

		User user = new User();
		if (list.isEmpty()) {
			System.out.println("not found");
		} else {
			user.setUserName(username);
			user.setRepoInfo(list);
			user.setCodeRepotype("github");
		}
		System.out.println(user.toString());

		return user;

	}
	
	

}

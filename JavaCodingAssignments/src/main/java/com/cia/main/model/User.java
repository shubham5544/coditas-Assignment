package com.cia.main.model;

import java.util.List;

public class User {
private String userName;
private String codeRepotype;
private List<RepositoryInfo> repoInfo;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getCodeRepotype() {
	return codeRepotype;
}
public void setCodeRepotype(String codeRepotype) {
	this.codeRepotype = codeRepotype;
}
public List<RepositoryInfo> getRepoInfo() {
	return repoInfo;
}
public void setRepoInfo(List<RepositoryInfo> repoInfo) {
	this.repoInfo = repoInfo;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", codeRepotype=" + codeRepotype + ", repoInfo=" + repoInfo + "]";
}



	
}

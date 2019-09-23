package com.cia.main.model;

public class RepositoryInfo {

	private long id;
	private String name;
	private String full_name;
 
	private Owner owner;
	private String html_url;
	private String description;
	private String fork;
	private String url;
	
	private String forks_url;
	private String keys_url;
	
	private String teams_url;
	private String branches_url;
	private String created_at;
	private String git_url;
	private String clone_url;
	private String svn_url;
	private String homepage;
	private int forks_count;
	private int size;
	private boolean has_projects;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getHtml_url() {
		return html_url;
	}
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFork() {
		return fork;
	}
	public void setFork(String fork) {
		this.fork = fork;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getForks_url() {
		return forks_url;
	}
	public void setForks_url(String forks_url) {
		this.forks_url = forks_url;
	}
	public String getKeys_url() {
		return keys_url;
	}
	public void setKeys_url(String keys_url) {
		this.keys_url = keys_url;
	}
	public String getTeams_url() {
		return teams_url;
	}
	public void setTeams_url(String teams_url) {
		this.teams_url = teams_url;
	}
	public String getBranches_url() {
		return branches_url;
	}
	public void setBranches_url(String branches_url) {
		this.branches_url = branches_url;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getGit_url() {
		return git_url;
	}
	public void setGit_url(String git_url) {
		this.git_url = git_url;
	}
	public String getClone_url() {
		return clone_url;
	}
	public void setClone_url(String clone_url) {
		this.clone_url = clone_url;
	}
	public String getSvn_url() {
		return svn_url;
	}
	public void setSvn_url(String svn_url) {
		this.svn_url = svn_url;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public int getForks_count() {
		return forks_count;
	}
	public void setForks_count(int forks_count) {
		this.forks_count = forks_count;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isHas_projects() {
		return has_projects;
	}
	public void setHas_projects(boolean has_projects) {
		this.has_projects = has_projects;
	}
	@Override
	public String toString() {
		return "RepositoryInfo [id=" + id + ", name=" + name + ", full_name=" + full_name + ", owner=" + owner
				+ ", html_url=" + html_url + ", description=" + description + ", fork=" + fork + ", url=" + url
				+ ", forks_url=" + forks_url + ", keys_url=" + keys_url + ", teams_url=" + teams_url + ", branches_url="
				+ branches_url + ", created_at=" + created_at + ", git_url=" + git_url + ", clone_url=" + clone_url
				+ ", svn_url=" + svn_url + ", homepage=" + homepage + ", forks_count=" + forks_count + ", size=" + size
				+ ", has_projects=" + has_projects + "]";
	}
	
	
	
	
	
}

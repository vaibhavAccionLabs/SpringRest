package com.springrest.springrest.entities;

public class Userinfo {
	private String sub;
    private String groups;
    private String cn;
    private String preferred_username;
    private String given_name;
    private String family_name;
    
    
	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Userinfo(String sub, String groups, String cn, String preferred_username, String given_name,
			String family_name) {
		super();
		this.sub = sub;
		this.groups = groups;
		this.cn = cn;
		this.preferred_username = preferred_username;
		this.given_name = given_name;
		this.family_name = family_name;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public String getGroups() {
		return groups;
	}


	public void setGroups(String groups) {
		this.groups = groups;
	}


	public String getCn() {
		return cn;
	}


	public void setCn(String cn) {
		this.cn = cn;
	}


	public String getPreferred_username() {
		return preferred_username;
	}


	public void setPreferred_username(String preferred_username) {
		this.preferred_username = preferred_username;
	}


	public String getGiven_name() {
		return given_name;
	}


	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}


	public String getFamily_name() {
		return family_name;
	}


	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}


	@Override
	public String toString() {
		return "Userinfo [sub=" + sub + ", groups=" + groups + ", cn=" + cn + ", preferred_username="
				+ preferred_username + ", given_name=" + given_name + ", family_name=" + family_name + ", getSub()="
				+ getSub() + ", getGroups()=" + getGroups() + ", getCn()=" + getCn() + ", getPreferred_username()="
				+ getPreferred_username() + ", getGiven_name()=" + getGiven_name() + ", getFamily_name()="
				+ getFamily_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
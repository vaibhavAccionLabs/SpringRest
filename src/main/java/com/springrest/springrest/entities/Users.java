package com.springrest.springrest.entities;

import java.util.List;

public class Users {
    private List<User> results;

    public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Users( List<User> results) {
		super();
		this.results = results;
	}

	public List<User> getResults() {
		return results;
	}

	public void setResults(List<User> results) {
		this.results = results;
	}
	
}

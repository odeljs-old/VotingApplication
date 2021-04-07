package com.eduonix.votingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="citizens")
@Entity
public class Citizen {
	
	
	public Citizen() {
		super();
	}

	public Citizen(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name="Id")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="citizen_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="hasvoted")
	private Boolean hasVoted;

	public Boolean getHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
	
	
}

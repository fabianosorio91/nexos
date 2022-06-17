package com.auto.nexos.model;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table (name = "cargo")
public class cargo {
	
	private int id;
	
	

	public cargo(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

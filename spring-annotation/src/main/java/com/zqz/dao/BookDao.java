package com.zqz.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	public String label="1";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "BookDao [label=" + label + "]";
	}
	
	
}

package com.springcore.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int id;
	private List<String> subject;
	private Set<String> phone;
	private Map<String,String> marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}
	
	public Student(int id, List<String> subject, Set<String> phone, Map<String, String> marks) {
		super();
		this.id = id;
		this.subject = subject;
		this.phone = phone;
		this.marks = marks;
	
	}
	public Student() {
		super();
		
	}
	
	
}

package com.guilhermepisco.springwebsockets.entities;

public class Incident {

	private String id;
	private String title;
	private String priority;
	private String status;
	private String application;
	private String description;
	
	public Incident() {
	}
	
	public Incident(String id, String title, String priority, String status, String application,
			String description) {
		super();
		this.id = id;
		this.title = title;
		this.priority = priority;
		this.status = status;
		this.application = application;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

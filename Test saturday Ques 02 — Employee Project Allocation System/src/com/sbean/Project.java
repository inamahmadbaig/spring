package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Project {
	private int projectId;
	private String projectName;
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void getProject() {
		System.out.println(" Project Id: "+projectId+" Project Name: "+projectName);
	}
}

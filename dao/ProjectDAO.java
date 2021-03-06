package com.ibm.achievement.dao;

import java.util.List;

import com.ibm.achievement.dao.model.Project;

public interface ProjectDAO {
	public List<Project> findAllProject();
	public List<Project> findProjectByEmpId(String employeeId);
	public void insertEmpProject(String projectID, String employeeId);
	public Project findProjectById(String projectId);
}

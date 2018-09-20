package com.jpa.training.rest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tasks {

	@Id
	@GeneratedValue
	private long taskId;

	private String taskName;
	private String taskDesc;

	@Temporal(TemporalType.DATE)
	private Date taskDate;

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(final String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(final String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Date getTaskDate() {
		return this.taskDate;
	}

	public void setTaskDate(final Date taskDate) {
		this.taskDate = taskDate;
	}

}

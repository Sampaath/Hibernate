package com.maven.HIBERNATE;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	private int rno;
	private String sname;
	private String subject;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rno=" + rno + ", subject=" + subject + "]";
	}
	
}

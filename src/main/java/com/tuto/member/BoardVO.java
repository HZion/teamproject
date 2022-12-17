package com.tuto.member;

import java.util.Date;

public class BoardVO {


	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public String getSesssion() {
		return sesssion;
	}

	public void setSesssion(String session) {
		this.sesssion = session;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isE() {
		return isE;
	}

	public void setE(boolean e) {
		isE = e;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	private int seq;
	private String subject;
	private String subject_code;
	private String sesssion;
	private String grade;
	private boolean isE;
	private String comment;
	private Date regdate;
	private int cnt;
}

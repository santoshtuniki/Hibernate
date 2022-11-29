package com.greatlearning.teachers.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Javax Annotations
//Utilizes Java Persistence API (JPA)
//New way of ORM --> Mapping a Java class to Database table

@Entity
@Table(name="teachers")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="subject", nullable=false)
	private String subject;
	
	@Column(name="exp", nullable=false)
	private int exp;
	
	//Mandatory for entity
	private Teacher() {
		
	}
		
	public Teacher(String name, String subject, int exp) {
		super();
		this.name = name;
		this.subject = subject;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", exp=" + exp + "]";
	}

}

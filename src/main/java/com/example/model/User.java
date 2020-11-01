package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	
	private String name;
	private String password;
	private Integer srating;
	private Integer prating;
	private String company;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	



	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", srating=" + srating + ", prating=" + prating
				+ ", company=" + company + ", id=" + id + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Integer getSrating() {
		return srating;
	}



	public void setSrating(Integer srating) {
		this.srating = srating;
	}



	public Integer getPrating() {
		return prating;
	}



	public void setPrating(Integer prating) {
		this.prating = prating;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}
	

}

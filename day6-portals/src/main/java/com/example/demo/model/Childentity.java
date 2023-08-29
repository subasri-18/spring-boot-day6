package com.example.demo.model;

//import org.hibernate.annotations.GenerationType;
//
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="childtable")

public class Childentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int babyid;
	private String bfname;
	private String blname;
	private String fname;
	private String mname;
	private String add;
	public Childentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Childentity(int babyid, String bfname, String blname, String fname, String mname, String add) {
		super();
		this.babyid = babyid;
		this.bfname = bfname;
		this.blname = blname;
		this.fname = fname;
		this.mname = mname;
		this.add = add;
	}
	public int getBabyid() {
		return babyid;
	}
	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}
	public String getBfname() {
		return bfname;
	}
	public void setBfname(String bfname) {
		this.bfname = bfname;
	}
	public String getBlname() {
		return blname;
	}
	public void setBlname(String blname) {
		this.blname = blname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
	
	

}

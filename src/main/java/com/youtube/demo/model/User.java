package com.youtube.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)

public class User extends ParentEntity {

	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column (name = "first_name", nullable=false, length= 255)
	private String firstName ;
	
	@Column (name = "second_name", nullable=true, length= 255)
	private String secondName ;
	
	@Column (name = "first_surname", nullable=false, length= 255)
	private String firstSurname ;
	
	@Column (name = "second_surname", nullable=true, length= 255)
	private String secondSurname;
	
	@Column (name = "phone", nullable=false, length=255)
	private String phone;
	
	@Column (name = "adrres", nullable=false, length=255)
	private String adrres;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdrres() {
		return adrres;
	}
	public void setAdrres(String adrres) {
		this.adrres = adrres;
	}
	         

}
 
package com.vamsi.domain;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;

@Table(name = "people",uniqueConstraints = {
		@UniqueConstraint(columnNames= {"fname"}),
		@UniqueConstraint(columnNames= {"lastname"})
		
})
		

@Entity(name = "crazy-people")
public class person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="fname",length=250)
	private String firstName;
	
	private String lastName;
	
	@Column(unique = true,length = 250)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthdate;
	
	@Transient
	@Temporal(TemporalType.DATE)
	private LocalDate boa;
	
	public person() {
		
	}
		
	public person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.setLastName(lastName);
	}
	

	public person(Long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.setLastName(lastName);
	}


	
	public person(String firstName, String lastName, String email, Date birthdate) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.birthdate=birthdate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public LocalDate getBoa() {
		return boa;
	}

	public void setBoa(LocalDate boa) {
		this.boa = boa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

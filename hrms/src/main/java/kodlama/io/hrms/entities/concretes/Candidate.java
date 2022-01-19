package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name ="candidates")
//iş arayan
public class Candidate extends Users {
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name ="identity_number")
	private String identityNumber;
	
	@Column(name="birth_of_year")
	private int birthOfYear;
	
	public Candidate () {
		
	}
	public Candidate(String firstName, String lastName, String identityNumber, int birthOfYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthOfYear = birthOfYear;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	
	
	

}

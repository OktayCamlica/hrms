package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Table(name ="employers")
@Entity
//iş veren
public class Employer extends Users{
	
	@Column(name ="company_name")
	private String companyName;
	
	@Column(name ="web_site")
	private String webSite;
	
	@Column(name ="phone")
	private String phone;
	
	public Employer () {
		
	}
	public Employer(String companyName, String webSite, String phone) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.phone = phone;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

}

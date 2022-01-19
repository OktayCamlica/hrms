package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="users")
public class Users {
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="eMail")
	private String eMail;
	
	@Column(name="password")
	private String password;
	
	@Column(name="passwordRepeat")
	private String passwordRepeat;
	
	
	public Users() {
		super();
	
	}
	public Users(int id, String eMail, String password, String passwordRepeat) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
		this.passwordRepeat = passwordRepeat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	

}

package kodlamaio.hrmsProje.Demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="employers" , schema="public")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {

	@Column(name="company_name")
    private String companyName;
	
	@Column(name="web_site")
	private String webSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	

	public Employer(int id, String gmail, String password, String companyName, String webSite, String phoneNumber) {
		super(id, gmail, password);
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}


package kodlamaio.hrmsProje.Demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="user", schema="public")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "user_id")
	private int id;
	
	@Column(name= "email")
	private String Gmail;
	
	@Column(name= "password")
    private String password;

	public User(int id, String gmail, String password) {
		super();
		this.id = id;
		Gmail = gmail;
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getGmail() {
		return Gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGmail(String gmail) {
		Gmail = gmail;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

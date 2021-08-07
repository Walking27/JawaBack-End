package kodlamaio.hrmsProje.Demo.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="candidates" )
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends User {
   
	public Candidate() {
		super();
		
	}

	@Column(name = "first_name")
	private String firstName;
	
    @Column(name = "last_name")
	private String lastName;
	
    @Column(name = "birth_of_date")
	private Date birthOfDate;
	
    @Column(name = "indentity_number")
	private String indentityNumber;

	public Candidate(int id, String gmail, String password, String firstName, String lastName, Date birthOfDate,
			String indentityNumber) {
		super(id, gmail, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.indentityNumber = indentityNumber;
	}

	
}

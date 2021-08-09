package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	
    List<User> findByMailVerifyTrue();

}

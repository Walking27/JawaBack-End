package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}

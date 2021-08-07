package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.EmployeeService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.EmployeeDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>>  getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"DataListelendi") ;
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Ürün Eklendi");
	}

	

}

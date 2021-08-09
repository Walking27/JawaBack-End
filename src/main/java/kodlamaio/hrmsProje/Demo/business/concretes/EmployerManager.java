package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.EmployerService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.EmployerDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.Employee;
import kodlamaio.hrmsProje.Demo.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	
    @Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>>  getAll() {
		
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"DataListelendi");
	}



	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Ürün Eklendi");
	}

	



	


}

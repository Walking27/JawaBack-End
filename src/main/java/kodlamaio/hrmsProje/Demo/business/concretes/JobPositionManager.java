package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.JobPositionService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.JobPositionDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<JobPosition>>  getAll() {
		return new SuccessDataResult<List<JobPosition>>
		(this.jobDao.findAll(),"DataListelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobDao.save(jobPosition);
		return new SuccessResult("Ürün Eklendi");
	}

}

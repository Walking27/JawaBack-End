package kodlamaio.hrmsProje.Demo.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.CandidateService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.CandidateDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	
    @Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	private CandidateDao candidateDao;

	@Override
	public DataResult<List<Candidate>>  getAll() {
		
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(),"DataListelendi");
		     
		
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Ürün Eklendi");
		
	}

	
	
}

	

	
	



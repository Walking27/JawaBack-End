package kodlamaio.hrmsProje.Demo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.Candidate;

public interface CandidateService {
	
	public DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate);
    
}

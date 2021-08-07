package kodlamaio.hrmsProje.Demo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobPosition;

public interface JobPositionService {

    public DataResult<List<JobPosition> > getAll();
    Result add(JobPosition jobPosition);
}

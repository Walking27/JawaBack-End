package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.UserService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.ErrorDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.CandidateDao;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.EmployerDao;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.StaffDao;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.UserDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.User;
import kodlamaio.hrmsProje.Demo.entities.dtos.UserLoginDto;
import kodlamaio.hrmsProje.Demo.entities.dtos.UserLoginReturnDto;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
    private CandidateDao candidateDao;
    private EmployerDao employerDao;
    private StaffDao staffDao;

    @Autowired
    public UserManager(UserDao userDao,CandidateDao candidateDao,EmployerDao employerDao,StaffDao staffDao) {
        this.userDao = userDao;
        this.candidateDao=candidateDao;
        this.employerDao=employerDao;
        this.staffDao=staffDao;
    }


    @Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>>  getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"DataListelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Ürün Eklendi");
	}
	@Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>
        (this.userDao.findByEmail(email),"Listelendi");
    }

   

    @Override
    public DataResult<List<User>> getVerifyedUsers() {
        return new SuccessDataResult<List<User>>
        (this.userDao.findByMailVerifyTrue(),"Data listelendi");
    }


	@Override
	public DataResult<UserLoginReturnDto> login(UserLoginDto userLoginDto) {
		// TODO Auto-generated method stub
		return null;
	}


	

}

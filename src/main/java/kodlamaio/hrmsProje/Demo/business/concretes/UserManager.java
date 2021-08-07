package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.UserService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.UserDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;


    @Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>>  getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"DataListelendi");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Ürün Eklendi");
	}

}

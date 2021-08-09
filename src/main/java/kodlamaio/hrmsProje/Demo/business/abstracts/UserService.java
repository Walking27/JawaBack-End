package kodlamaio.hrmsProje.Demo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.User;
import kodlamaio.hrmsProje.Demo.entities.dtos.UserLoginDto;
import kodlamaio.hrmsProje.Demo.entities.dtos.UserLoginReturnDto;

public interface UserService {
	
	DataResult<List<User>>  getAll();
	Result add(User user);
	DataResult<User> getByEmail(String email);
    DataResult<UserLoginReturnDto> login(UserLoginDto userLoginDto);
    DataResult<List<User>> getVerifyedUsers();
	

}

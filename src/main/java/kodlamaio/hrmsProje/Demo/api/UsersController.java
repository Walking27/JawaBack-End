package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrmsProje.Demo.business.abstracts.UserService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.User;

@RequestMapping("/api/users")
@RestController
public class UsersController {
	
	private UserService userService;
	
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}



	@GetMapping(name = "getall")
	public DataResult<List<User>>  getall(){
		return this.userService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}

}

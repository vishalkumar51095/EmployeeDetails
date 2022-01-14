package com.employee.EmployeeDetails;

//import com.employee.EmployeeDetails.dao.UserRepository;
//import com.employee.EmployeeDetails.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeDetailsApplication {

	public static void main(String[] args) {
		//ApplicationContext context= SpringApplication.run(EmployeeDetailsApplication.class,args);
		SpringApplication.run(EmployeeDetailsApplication.class,args);
		//context.getbean(UserRepository.class);
		//UserRepository userRepository=context.getBean(UserRepository.class);

		//User user=new User();
		//user.setName("Vishal");
		//user.setAddress("Varanasi");
		//user.setPost("java developer");
		//user.setEmail("vishalkumar95@gmail.com");
		//User user1=userRepository.save(user);
		//System.out.println(user1);

		//userRepository.save(user1);
		System.out.println("Application Started");
	}

}

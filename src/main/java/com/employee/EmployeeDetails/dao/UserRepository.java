package com.employee.EmployeeDetails.dao;

import com.employee.EmployeeDetails.entities.User;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}

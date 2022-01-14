package com.employee.EmployeeDetails.service;

import com.employee.EmployeeDetails.dao.UserRepository;
import com.employee.EmployeeDetails.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private UserRepository repo;

    public EmployeeService(UserRepository repo) {
        this.repo=repo;
    }

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }
    public void save(User std){ repo.save(std);}

    public User get(long id){ return repo.findById(id).get();}

    public void delete(long id){ repo.deleteById((id));}

}
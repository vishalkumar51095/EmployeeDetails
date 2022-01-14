package com.employee.EmployeeDetails.controller;

import com.employee.EmployeeDetails.entities.User;
import com.employee.EmployeeDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<User> listemployee = service.listAll();
        model.addAttribute("listemployee", listemployee);
        System.out.print("Get / ");
        return "index.html";
    }

    @GetMapping("/new")
    public String add(Model model) {
        System.out.println("Add");
        model.addAttribute("user", new User());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("user") User std) {
        service.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        User std = service.get(id);
        mav.addObject("user", std);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
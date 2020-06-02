package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("showForm")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }

    @PostMapping("/addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, Model model, BindingResult bindingResult){
        model.addAttribute("id",employee.getId());
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        return "/employee/infor";
    }
}

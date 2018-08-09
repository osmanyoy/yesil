package com.allianz.spring.boot.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRest {

    @Autowired
    private EmployeeManager empManager;

    @GetMapping("/add/{isim}/{soyisim}")
    public String addEmployee(@PathVariable("isim") final String name,
                              @PathVariable("soyisim") final String surname,
                              @RequestParam("empId") final long employeeId,
                              @RequestParam("yas") final int age) {
        Employee employeeLoc = new Employee();
        employeeLoc.setAge(age);
        employeeLoc.setEmployeeId(employeeId);
        employeeLoc.setName(name);
        employeeLoc.setSurname(surname);

        this.empManager.addEmployee(employeeLoc);

        return "OK";
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return this.empManager.getAllEmployees();
    }

    @GetMapping("/remove/{empId}")
    public String removeEmployee(@PathVariable("empId") final long empId) {
        this.empManager.removeEmployee(empId);
        return "OK";
    }

    @PostMapping("/add2")
    public String addEmployee2(@RequestBody final Employee employeeParam) {
        this.empManager.addEmployee(employeeParam);
        return "OK";
    }

}

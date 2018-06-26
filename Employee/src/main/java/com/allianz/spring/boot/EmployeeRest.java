package com.allianz.spring.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
@Validated
public class EmployeeRest {

    @Autowired
    private EMployeeDAO empDAO;

    @PostMapping("/add")
    public String insert(@NotNull @RequestBody final Employee empl) {
        try {
            empl.setEmpId(null);
            this.empDAO.save(empl);
            return "OK";
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return "ERROR";
    }

    @PostMapping("/update")
    public String update(@NotNull @RequestBody final Employee empl) {
        try {
            if (empl.getEmpId() == null) {
                return "Error : empId girin";
            }
            this.empDAO.save(empl);
            return "OK";
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return "ERROR";
    }

    @GetMapping("/getbyid/{empid}")
    public ResponseEntity<?> getEmployee(@PathVariable("empid") final long id) {
        Optional<Employee> findByIdLoc = this.empDAO.findById(id);
        if (findByIdLoc.isPresent()) {
            return ResponseEntity.ok(findByIdLoc.get());
        }
        return ResponseEntity.badRequest()
                             .body("Yanlış id geçtiniz");
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployee() {
        List<Employee> empList = new ArrayList<>();
        Iterable<Employee> findAllLoc = this.empDAO.findAll();
        for (Employee employeeLoc : findAllLoc) {
            empList.add(employeeLoc);
        }
        return empList;
    }

    @GetMapping("/delete/{empid}")
    public String deleteEmployee(@PathVariable("empid") final long id) {
        try {
            this.empDAO.deleteById(id);
            return "OK";
        } catch (Exception eLoc) {

        }
        return "Error";
    }

}

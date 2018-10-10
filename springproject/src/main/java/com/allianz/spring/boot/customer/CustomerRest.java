package com.allianz.spring.boot.customer;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerRest {

    @Autowired
    private CustomerManager custormerManager;

    @GetMapping("/hello")
    public String helloworld() {
        return "hello";
    }

    @GetMapping("/add/{isim}")
    public String addCustomer(@PathVariable("isim") final String name) {
        Customer customer = new Customer();
        customer.setName(name);
        this.custormerManager.addCustomer(customer);
        return "Customer eklendi " + name;
    }

    @GetMapping("/all")
    public Collection<Customer> getAllCustomers() {
        return this.custormerManager.getAllCustomers();
    }

    @GetMapping("/remove/{id}")
    public String removeCustomer(@PathVariable("id") final long custId) {
        this.custormerManager.deleteCustomer(custId);
        return "Customer eklendi " + custId;
    }

    @PostMapping("/add")
    public String addCustomer(@Valid @RequestBody final Customer customerParam) {

        List<PhoneItem> phoneItemsLoc = customerParam.getPhoneItems();
        for (PhoneItem phoneItemLoc : phoneItemsLoc) {
            phoneItemLoc.setCustomer(customerParam);
        }

        this.custormerManager.addCustomer(customerParam);
        return "OK";
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ConstraintViolationException.class)
    public String handleConstraintViolationException(final ConstraintViolationException exp) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Error : ");
        Set<ConstraintViolation<?>> constraintViolationsLoc = exp.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolationLoc : constraintViolationsLoc) {
            builderLoc.append(constraintViolationLoc.getConstraintDescriptor());
        }
        return builderLoc.toString();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(Exception.class)
    public String handleException(final Exception exp) {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Error : " + exp.getMessage());
        return builderLoc.toString();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleMException(final MethodArgumentNotValidException exp) {
        StringBuilder builderLoc = new StringBuilder();
        List<ObjectError> allErrorsLoc = exp.getBindingResult()
                                            .getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            builderLoc.append(objectErrorLoc.getObjectName()
                              + " ---- "
                              + objectErrorLoc.getCode()
                              + "----"
                              + objectErrorLoc.getArguments()
                                              .toString());
        }

        return builderLoc.toString();
    }


}

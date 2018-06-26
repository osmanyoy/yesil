package com.allianz.spring.boot;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/cust")
@RequestScope
public class CustomerRest {

    // kULLANMA
    @Autowired
    private Customer          customer;

    @Autowired
    private CustomerProcessor cp;

    @RequestMapping(path = "/create/{soyisim}/test/{yas}", method = RequestMethod.GET)
    public Customer createCustomer(@NotEmpty @Size(min = 5) @RequestParam("isim") final String name,
                                   @PathVariable("soyisim") final String surname,
                                   @PathVariable("yas") final int age) {
        Customer customerLoc = new Customer();
        customerLoc.setName(name);
        customerLoc.setSurname(surname);
        customerLoc.setAge(age);

        return this.cp.processCustomer(customerLoc);
    }

    @RequestMapping(path = "/create2", method = RequestMethod.GET)
    public Customer createCustomer2(@NotEmpty @Size(min = 5) @RequestHeader("isim") final String name,
                                    @RequestHeader("soyisim") final String surname,
                                    @RequestHeader("yas") final int age) {
        Customer customerLoc = new Customer();
        customerLoc.setName(name);
        customerLoc.setSurname(surname);
        customerLoc.setAge(age);

        return this.cp.processCustomer(customerLoc);
    }

    @RequestMapping(path = "/create3", method = RequestMethod.POST)
    public Customer createCustomer3(@RequestBody final Customer customerParam) throws CustomerException {
        if (customerParam.getName().length() < 3) {
            CustomerException ce = new CustomerException();
            ce.setDesc("isim 3 den küçük olamaz");
            throw ce;
        }
        return this.cp.processCustomer(customerParam);
    }

    @RequestMapping(path = "/create4", method = RequestMethod.POST)
    public Customer createCustomer4(@RequestBody @Valid final Customer customerParam) throws CustomerException {
        return this.cp.processCustomer(customerParam);
    }

    @RequestMapping(path = "/create5", method = RequestMethod.POST)
    public Customer createCustomer4(final HttpServletRequest httpServletRequestParam,
                                    final HttpServletResponse servletResponseParam) throws CustomerException {
        try {
            ServletInputStream inputStreamLoc = httpServletRequestParam.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(path = "/create6", method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer6(@RequestBody final Customer customerParam) {
        if (customerParam == null) {
            return ResponseEntity.badRequest().body(new ErrorObj(100,
                                                                 "Customer null olamamz"));
        }
        if ((customerParam.getSurname() == null) || customerParam.getSurname().isEmpty()) {
            return ResponseEntity.badRequest().body(new ErrorObj(101,
                                                                 "surname boş olamaz"));
        }
        if (customerParam.getSurname().length() < 5) {
            return ResponseEntity.badRequest().body(new ErrorObj(102,
                                                                 "surname 5 den küçük olamaz"));
        }
        Customer processCustomerLoc = this.cp.processCustomer(customerParam);
        return ResponseEntity.ok(processCustomerLoc);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleCustexception(final MethodArgumentNotValidException ce) {
        String str = "";
        List<ObjectError> allErrorsLoc = ce.getBindingResult().getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            str += objectErrorLoc.getDefaultMessage();
        }
        return str;
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomerException.class)
    public String handleCustexception(final CustomerException ce) {
        return ce.getDesc();
    }


}

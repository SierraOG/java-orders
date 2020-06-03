package local.sierraog.javaorders.controllers;

import local.sierraog.javaorders.models.Customer;
import local.sierraog.javaorders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/orders",
            produces = {"application/json"})
    public ResponseEntity<?> listCustomerOrders()
    {
        List<Customer> myCustomers = customerService.findAllCustomers();
        return new ResponseEntity<>(myCustomers,
                HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{id}",
            produces = {"application/json"})
    public ResponseEntity<?> listCustomerWithId(
            @PathVariable
                int id
    )
    {
        Customer myCustomer = customerService.findCustomerWithId(id);
        return new ResponseEntity<>(myCustomer,
                HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{likename}",
            produces = {"application/json"})
    public ResponseEntity<?> listCustomersWithLikeName(
            @PathVariable
                String likename
    )
    {
        List<Customer> myCustomers = customerService.findCustomersWithLikeName(likename);
        return new ResponseEntity<>(myCustomers,
                HttpStatus.OK);
    }
}

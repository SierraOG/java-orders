package local.sierraog.javaorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/orders")
    public ResponseEntity<?> listCustomerOrders()
    {
        List<Customer> myCustomers = customerService.findAllCustomers();
        return new ResponseEntity<>(myCustomers,
                HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity<?> listCustomerWithId(
            @PathVariable
                int id
    )
    {
        Customer myCustomer = customerService.findCustomerWithId(id);
        return new ResponseEntity<>(myCustomer,
                HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{likename}")
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

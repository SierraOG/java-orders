package local.sierraog.javaorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/order/{id}")
    public ResponseEntity<?> listOrderWithId(
            @PathVariable
                    int id
    )
    {
        Customer myOrder = orderService.findOrderWithId(id);
        return new ResponseEntity<>(myOrder,
                HttpStatus.OK);
    }
}

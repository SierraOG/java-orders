package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Order;
import local.sierraog.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl
        implements OrderService
{
    @Autowired
    private OrderRepository orderrepos;

    @Override
    public Order findOrderWithId(long id)
    {
        return orderrepos.findByIdContainingIgnoreCase(id);
    }
}

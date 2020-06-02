package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Agent;
import local.sierraog.javaorders.models.Order;

public interface OrderService {
    Order findOrderWithId(long id);
}

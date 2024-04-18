package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100.0 - shippingService.shipment(order.getBasic()));
    }
}

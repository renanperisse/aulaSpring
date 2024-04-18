package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basicValue) {
        double value;
        if (basicValue < 100.0) {
            value = 20.0;
        }
        else if (basicValue > 200.0) {
            value = 0.0;
        }
        else {
            value = 12.0;
        }
        return value;
    }
}

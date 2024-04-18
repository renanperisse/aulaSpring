package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	private OrderService orderService;
	private Order order = new Order(1309, 95.90, 0.0);

	public AulaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));

	}

}

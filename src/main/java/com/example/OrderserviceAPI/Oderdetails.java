package com.example.OrderserviceAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oderdetails {
	
	@GetMapping(value="/orders/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	//@GetMapping(value="/orders/{orderId}", produces = MediaType.APPLICATION_XML_VALUE)	
	//public void getOrderDetails(@PathVariable String orderId) {
		//public String getOrderDetails(@PathVariable String orderId) {
		public ResponseEntity<OrderDTO> getOrderDetails(@PathVariable String orderId) {
		OrderDTO or = new OrderDTO();
		
		or.setOrderId("1234");
		or.setOderName("Pizza");
		or.setOrderDescription("Ordered");
		System.out.println("Order details execution");
		return new ResponseEntity<>(or,HttpStatus.OK);
	}
}

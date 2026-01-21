package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
     private int OrderId;
     private String customerName;
     private int quantity;
     @Autowired
     
     private Product product;
  
    
     public Order() {
    	 this.OrderId=2004;
    	 this.customerName="Neha";
    	 this.quantity=4;
     }
     public void display() {
    	 System.out.println("The following are the order details of customer");
    	 System.out.println("OrderId:"+OrderId);
    	 System.out.println("CustName:"+customerName);
    	 System.out.println("Quantity:"+quantity);
    	 System.out.println("ProductId:"+product.getProductId());
    	 System.out.println("ProductName:"+product.getProductName());
    	 System.out.println("ProductPrice:"+product.getPrice());
    	 System.out.println("ProductCategory:"+product.getCategory());
     
     }
}

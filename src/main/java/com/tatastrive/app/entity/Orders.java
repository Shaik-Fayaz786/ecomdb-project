package com.tatastrive.app.entity;



import java.util.List;

import com.tatastrive.app.entity.Customer;
import com.tatastrive.app.entity.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String orderDate;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer; 
	
	@ManyToMany
	 @JoinTable(name = "order_product",
		        joinColumns = @JoinColumn(name = "order_id"),
		        inverseJoinColumns = @JoinColumn(name = "product_id")
		    )
	private List<Product> products;

}

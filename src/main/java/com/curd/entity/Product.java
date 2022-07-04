package com.curd.entity;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product_TBL")
public class Product {
	@Id
	@GeneratedValue
	private int id;
    private String name;
    private int quantity;
    private double price;
}

package com.eidiko.niranjana.entity;
import lombok.Data;
@Data
public class Product {
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodGst;
	private Double prodDisc;
}
//create table products(pid int,pcode varchar(20), pcost double, pdisc double,pgst double);

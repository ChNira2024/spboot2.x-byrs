package com.app.raghu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="prodtab_collection")
public class Product 
{
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pcode")
	private String prodCode;
	
	@ElementCollection  //Mandatory annotation
	@CollectionTable(name="product_colorss",joinColumns = @JoinColumn(name="pidFK")) //Optional annotation
	@OrderColumn(name="pos") //index //optional annotation
	@MapKeyColumn(name="data") //index     //optional annotation
	private List<String> colors;
	
	@ElementCollection //Mandatory annotation
	@CollectionTable(name="product_models",joinColumns = @JoinColumn(name="pidFK")) //Optional annotation
	@Column(name="model") //index column for Map    //optional annotation
	private Set<String> models;
	
	@ElementCollection //Mandatory annotation
	@CollectionTable(name="product_details",joinColumns = @JoinColumn(name="pidFK")) //Optional annotation
	@MapKeyColumn(name="code") //index     //optional annotation
	private Map<String,String> details;
	
	
}

//What is Bag in Hibernate/JPA?
//Ans:A List Collection is  used and table is created without index is called as bag. 
//List means 3 column(Key,index,element), Bag means 2 column(List - index)without index

//note:FK column will created for List and Map not for Set,  becoz Set has no duplicate data


//Hibernate: drop table if exists product_models
//Hibernate: create table prodtab_collection (pid integer not null, pcode varchar(255), primary key (pid)) engine=InnoDB
//Hibernate: create table product_colorss (pidfk integer not null, colors varchar(255), pos integer not null, primary key (pidfk, pos)) engine=InnoDB
//Hibernate: create table product_details (pidfk integer not null, details varchar(255), code varchar(255) not null, primary key (pidfk, code)) engine=InnoDB
//Hibernate: create table product_models (pidfk integer not null, model varchar(255)) engine=InnoDB
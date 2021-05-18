package com.example.users.model;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

//@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@Entity
//@Table(name="item", schema="public")
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private Long id;
	
	@Column(name="item_name")
	private String name;

	 //@OneToOne(cascade = CascadeType.ALL, mappedBy = "item") 
	//@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name="customer_id")
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
	//@JsonBackReference
	//private Customer customer;
	//private Set<Customer> customers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Set<Customer> getCustomers() { return customers; }
	 * 
	 * public void setCustomers(Set<Customer> customers) { this.customers =
	 * customers; }
	 */
}

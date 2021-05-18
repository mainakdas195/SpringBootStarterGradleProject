package com.example.users.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;

@Entity
@Table(name="customer", schema="public")
@AllArgsConstructor
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
	@SequenceGenerator(name="sequence_generator", schema="public")
	@Column(name="customer_id")
	private Long id;
	
	@Column(name="customer_name")
	private String name;

	//CascadeType.ALL means whenever you are saving customer then it will save Item as well
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_itemId")
	//@JoinTable(name="customer_item", joinColumns = {@JoinColumn(name="customer_id")}, inverseJoinColumns = {@JoinColumn(name="item_id")})
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="customer_Id")
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	//@ManyToMany(cascade = CascadeType.ALL)
	//@JoinTable(name="customer_item", joinColumns = {@JoinColumn(name="customer_id")}, inverseJoinColumns = {@JoinColumn(name="item_id")})
	//@JsonManagedReference
	//private Set<Item> items;
	
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
	 * public Set<Item> getItems() { return items; }
	 * 
	 * public void setItems(Set<Item> items) { this.items = items; }
	 */
}

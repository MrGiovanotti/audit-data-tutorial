package com.mrgiovanotti.auditdatatutorial.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mrgiovanotti.auditdatatutorial.auditing.AuditingData;
import com.mrgiovanotti.auditdatatutorial.entities.dto.CustomerDTO;

@Entity
@Table(name = "customers")
public class Customer extends AuditingData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String lastname;

    public Customer() {

    }

    public Customer(CustomerDTO customerDTO) {
	name = customerDTO.getName();
	lastname = customerDTO.getLastname();
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

}

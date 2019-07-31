package com.wearperfect.datastoreapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="collection")
@Data
public class Collection {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="desc")
	private String desc;
	
	@Column(name="active")
	private boolean active;
	
}

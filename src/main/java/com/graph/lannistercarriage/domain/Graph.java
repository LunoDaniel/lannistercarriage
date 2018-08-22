package com.graph.lannistercarriage.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Graph {

	private Long id;
	private List<Route> data;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "graph_route",
	        joinColumns = @JoinColumn(name = "graph_id"),
	        inverseJoinColumns = @JoinColumn(name = "route_id")
	    )	public List<Route> getData() {
		return data;
	}

	public void setData(List<Route> data) {
		this.data = data;
	}

}

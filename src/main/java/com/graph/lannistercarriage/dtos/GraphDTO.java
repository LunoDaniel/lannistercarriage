package com.graph.lannistercarriage.dtos;

import java.util.List;

public class GraphDTO {

	private Long id;
	private List<RouteDTO> data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<RouteDTO> getData() {
		return data;
	}

	public void setData(List<RouteDTO> data) {
		this.data = data;
	}

}

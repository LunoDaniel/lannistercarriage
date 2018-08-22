package com.graph.lannistercarriage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graph.lannistercarriage.converters.GraphConverter;
import com.graph.lannistercarriage.domain.Graph;
import com.graph.lannistercarriage.dtos.GraphDTO;
import com.graph.lannistercarriage.repository.GraphRepository;

@Service
public class GraphService {
	
	@Autowired
	private GraphConverter converter;
	
	@Autowired
	private GraphRepository repository;
	
	public GraphDTO saveGraph(GraphDTO graphDto) {
		Graph graph = repository.save(converter.convert(graphDto));
		return converter.convert(graph);
	}

}

package com.graph.lannistercarriage.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.graph.lannistercarriage.domain.Graph;
import com.graph.lannistercarriage.dtos.GraphDTO;

@Component
public class GraphConverter implements Converter<GraphDTO, Graph> {
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Graph convert(GraphDTO source) {
		return modelMapper.map(source, Graph.class);
	}
	
	public GraphDTO convert(Graph source) {
		return modelMapper.map(source, GraphDTO.class);
	}

}

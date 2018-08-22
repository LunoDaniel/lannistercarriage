package com.graph.lannistercarriage.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.graph.lannistercarriage.domain.Route;
import com.graph.lannistercarriage.dtos.RouteDTO;

@Component
public class RouteConverter implements Converter<RouteDTO, Route>{

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Route convert(RouteDTO source) {
		return modelMapper.map(source, Route.class);
	}

}

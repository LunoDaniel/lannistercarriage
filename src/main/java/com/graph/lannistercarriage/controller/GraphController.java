package com.graph.lannistercarriage.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.graph.lannistercarriage.dtos.GraphDTO;
import com.graph.lannistercarriage.service.GraphService;

@RestController
public class GraphController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(GraphController.class);
	
	@Autowired
	private GraphService graphService;
	
	@PostMapping
	@RequestMapping("/graph")
	public @ResponseBody ResponseEntity<GraphDTO> payLoadGraph(@RequestBody GraphDTO routesGraph){
		try {
			GraphDTO graph = graphService.saveGraph(routesGraph);
			return ResponseEntity.created(new URI("/graph")).body(graph);
		} catch (URISyntaxException e) {
			logger.error("Error on save.");
		}
		return null;
	}
	
	

}

package com.graph.lannistercarriage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graph.lannistercarriage.domain.Graph;

@Repository
public interface GraphRepository extends JpaRepository<Graph, Long>{

}

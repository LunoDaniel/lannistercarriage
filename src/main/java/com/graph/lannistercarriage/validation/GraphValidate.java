package com.graph.lannistercarriage.validation;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.graph.lannistercarriage.dtos.GraphDTO;

@Component
public class GraphValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return GraphDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(target instanceof GraphDTO) {
			GraphDTO graph = (GraphDTO) target;
			
			if(CollectionUtils.isEmpty(graph.getData())) {
				errors.rejectValue("graph", "empty.value");
			}
		}
	}

}

package com.consultorio.configuracao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.execution.ExecutionStrategy;

@Configuration
public class GraphQLConfig {

	@Bean
	public Map<String, ExecutionStrategy> executionStrategies() {
		Map<String, ExecutionStrategy> executionStrategyMap = new HashMap<>();
		executionStrategyMap.put("queryExecutionStrategy", new AsyncTransactionalExecutionStrategy());
		return executionStrategyMap;
	}

}

package com.consultorio.configuracao;

import java.util.concurrent.CompletableFuture;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import graphql.ExecutionResult;
import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionContext;
import graphql.execution.ExecutionStrategyParameters;
import graphql.execution.NonNullableFieldWasNullException;

@Service
public class AsyncTransactionalExecutionStrategy extends AsyncExecutionStrategy {

	@Override
	@Transactional
	public CompletableFuture<ExecutionResult> execute(ExecutionContext executionContext,
			ExecutionStrategyParameters parameters) throws NonNullableFieldWasNullException {
		return super.execute(executionContext, parameters);
	}
}

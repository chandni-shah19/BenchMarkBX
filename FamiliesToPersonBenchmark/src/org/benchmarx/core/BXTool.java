package org.benchmarx.core;

import java.util.function.Consumer;

public interface BXTool<S, T, C> {

	public void initiateSynchronisationDialogue();

	public void performAndPropagateTargetEdit(Consumer<T> edit);

	public void performAndPropagateSourceEdit(Consumer<S> edit);

	public S getSourceModel();

	public T getTargetModel();
	
	public void setConfigurator(C configurator);
}

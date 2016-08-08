package org.benchmarx.core;

public interface Comparator<M> {

	void compare(M expected, M actual);

}

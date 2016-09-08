package org.benchmarx.core;

import Persons.PersonRegister;

public interface Comparator<M> {

	void compare(M expected, M actual);

	

}

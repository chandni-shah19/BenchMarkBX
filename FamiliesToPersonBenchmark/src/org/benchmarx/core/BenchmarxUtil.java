package org.benchmarx.core;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class BenchmarxUtil {

	@SuppressWarnings("unchecked")
	public <T> T loadExpectedModel(String name) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	      
		Resource resource = resourceSet.createResource(URI.createFileURI("resources/" + name + ".xmi"));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return (T)resource.getContents().get(0);
	}

}

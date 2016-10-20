package org.benchmarx;

import java.io.IOException;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class BenchmarxUtil<S,T, D> {

	private Comparator<S> src;
	private Comparator<T> trg;
	private BXTool<S, T, D> tool;
	
	public BenchmarxUtil(Comparator<S> src, Comparator<T> trg, BXTool<S,T,D> tool){
		this.src = src;
		this.trg = trg;
		this.tool = tool;
	}
	
	@SuppressWarnings("unchecked")
	private <M> M loadExpectedModel(String name) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	      
		Resource resource = resourceSet.createResource(URI.createFileURI("resources/" + name + ".xmi"));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (M)resource.getContents().get(0);
	}

	public void assertSource(String path){
		src.compare(loadExpectedModel(path), tool.getSourceModel());
	}
	
	public void assertTarget(String path){
		trg.compare(loadExpectedModel(path), tool.getTargetModel());
	}
	
	public Configurator<D> configure() {
		Configurator<D> c = new Configurator<>();
		tool.setConfigurator(c);
		return c;
	}
	
	public <X> Consumer<X> execute(Consumer<X> a){
		return a;
	}
}

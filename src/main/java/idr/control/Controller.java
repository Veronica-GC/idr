package idr.control;

import java.beans.PropertyChangeListener;

import idr.core.Model;

public abstract class Controller implements PropertyChangeListener{
	protected Object view;
	protected Model model;
	
	public Controller(Object view, Model model){
		this.view = view;
		this.model = model;
	}
}
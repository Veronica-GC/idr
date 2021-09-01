package idr.control;

import java.beans.PropertyChangeEvent;

import idr.core.Model;

public class ControllerSeleccionArchivo extends Controller{

	public ControllerSeleccionArchivo(Object view, Model model) {
		super(view, model);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		model.addListener(this);
	}

}

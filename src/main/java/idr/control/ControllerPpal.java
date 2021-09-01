package idr.control;

import java.beans.PropertyChangeEvent;

import idr.core.Model;

/**
 * Controlador para la ventana Ppal
 * @author Verónica Campos
 *
 */
public class ControllerPpal extends Controller{

	public ControllerPpal(Object view, Model model) {
		super(view, model);
		model.addListener(this);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// Falta indicar que hace en caso de un cambio del modelo
	}

}

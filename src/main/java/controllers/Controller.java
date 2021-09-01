package controllers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class Controller implements PropertyChangeListener{

		@Override
		public void propertyChange(PropertyChangeEvent arg0) {}
}

package idr.core;

import java.beans.PropertyChangeListener;
import java.io.File;

/**
 * Interface del Modelo  
 * @author Verónica Campos
 *
 */
public interface Model {
	
	/**
	 * Añade observadores a la lista
	 * @param listener
	 */
	public void addListener(PropertyChangeListener listener);

	/**
	 * Remueve observadores de la lista
	 * @param listener
	 */
    public void removeListener(PropertyChangeListener listener);
	
	/**
	 * Recibe el archivo para su analisis //puede ser imagen o pdf
	 * @param file
	 */
	void processInvoicePDF(File file);
	
	/**
	 * Recibe el archivo para su analisis //puede ser imagen o pdf
	 * @param file
	 */
	void processInvoiceJPG(File file);
	
	/**
	 * Devuelve un archivo (json? xml) con los datos obtenidos
	 * @return
	 */
	File retrieveData();
}

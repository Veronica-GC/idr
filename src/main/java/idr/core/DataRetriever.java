package idr.core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;

/**
 * Implementación del modelo
 * @author Verónica Campos
 *
 */
public class DataRetriever  implements Model{
	private File result = null;
	private PropertyChangeSupport support;

	public DataRetriever() {
        support = new PropertyChangeSupport(this);
    }

	@Override
	public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

	@Override
    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

	@Override
	public void processInvoicePDF(File file) {
		result= PDFDataCollector.getText(file);
	}

	@Override
	public void processInvoiceJPG(File file) {
		// TODO Auto-generated method stub
	}

	@Override
	public File retrieveData() {
		return result;
	}

}

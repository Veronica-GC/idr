package idr.core;

import java.io.File;

/**
 * Implementación de la interface del modelo
 * @author Verónica Campos
 *
 */
public class DataRetriever  implements Model{
	private File result = null;

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

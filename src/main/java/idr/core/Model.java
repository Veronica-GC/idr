package idr.core;

import java.io.File;

public interface Model {

    void subscribe(String eventType, ListenerDataRetriever listener);
    void unsubscribe(String eventType, ListenerDataRetriever listener);
    void notify(String eventType, File file);
	
	/**
	 * Recibe el archivo pdf para su analisis
	 * @param file
	 */
	void setFilePDF(File file);
	/**
	 * Devuelve un archivo (json?) con los datos obtenidos
	 * @return
	 */
	File getData();
}

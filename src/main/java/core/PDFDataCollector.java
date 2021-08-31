package core;

import java.io.File;
import java.io.FileInputStream;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PDFDataCollector {
	/**
	 * Convierte el c�digo pdf a texto
	 * @author Ver�nica Campos
	 *
	 */
	public static File getText (File pdfFile){
	    String result = null;
	    FileInputStream fis = null;
		PDDocument document = null;
	    try {
			fis = new FileInputStream(pdfFile);
			PDFParser parser = new PDFParser((RandomAccessRead) fis);
			parser.parse();
			document = parser.getPDDocument();
			org.apache.pdfbox.text.PDFTextStripper stripper = new org.apache.pdfbox.text.PDFTextStripper();
			result = stripper.getText(document);
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return null;
	}
}

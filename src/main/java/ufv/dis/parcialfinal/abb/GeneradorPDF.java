package ufv.dis.parcialfinal.abb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneradorPDF {

	public static void generarPDF(Usuario u) throws FileNotFoundException, DocumentException {
		
		String filename = "pdfs/" + u.getName() + "-" + u.getLastname() + ".pdf";
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(filename));
		document.open();
		
		document.add(new Paragraph("Name: " + u.getName()));
		document.add(new Paragraph("Lastname: " + u.getLastname()));
		document.add(new Paragraph("Age: " + u.getAge()));
		document.add(new Paragraph("Adult?: " + u.isAdult()));
		document.add(new Paragraph("Fecha de generación: " + new Date(0)));
		
		
		
		document.close();
	}
	
}

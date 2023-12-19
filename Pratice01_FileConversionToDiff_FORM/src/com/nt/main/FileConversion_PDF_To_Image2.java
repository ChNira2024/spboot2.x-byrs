package com.nt.main;	//Jars:-   pdfbox 1.8.15, fontbox-1.7.1, commons-logging 1.2  (Not implemented)

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class FileConversion_PDF_To_Image2 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\dummy.pdf");
		PDDocument doc = PDDocument.loadNonSeq(file, null);
		List<PDPage> pdPages = doc.getDocumentCatalog().getAllPages();
		int page=0;
		for(PDPage pdPage : pdPages)
		{
		    ++page;
			BufferedImage bim  = pdPage.convertToImage(BufferedImage.TYPE_INT_RGB,300);
			//ImageIOUtil.writeImage(bim, file+"-"+pdPage+".png", 300);
	}	
	}
}

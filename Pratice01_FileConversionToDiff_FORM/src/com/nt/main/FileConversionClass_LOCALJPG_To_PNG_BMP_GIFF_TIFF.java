package com.nt.main;

import java.awt.image.BufferedImage;   //1.......Take JPG file path from URL and try to convert it to png, bmp, gif and stored in Local Drive
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class FileConversionClass_LOCALJPG_To_PNG_BMP_GIFF_TIFF
{
	public static void main(String[] args) 
	{

		try {
			//Here we collect the location of jpg location from Local Drive
		File fileLocation = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\success.jpg");
			
			//Read the URL using read method which is static method and returns BufferedImage
				BufferedImage image = ImageIO.read(fileLocation);
		
		//After reading, we must write that file to somewhere destination by using write() method which has 3-param like (ImageIO image, image format, Destination)
				ImageIO.write(image, "png", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\FileConversion1\\success.png")); 
				ImageIO.write(image, "bmp", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\\\FileConversion1\\success.bmp"));
				ImageIO.write(image, "gif", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\\\FileConversion1\\success.gif"));
				ImageIO.write(image, "jpg", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\\\FileConversion1\\success.jpg"));
				ImageIO.write(image, "tiff", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\\\FileConversion1\\success.tiff"));
				ImageIO.write(image, "pdf", new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\FileConversion\\Images\\\\FileConversion1\\success.pdf"));  //not converted
			}
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Conversion Happend...");
	}

}

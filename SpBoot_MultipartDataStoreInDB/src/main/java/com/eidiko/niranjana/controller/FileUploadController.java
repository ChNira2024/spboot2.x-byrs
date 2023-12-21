package com.eidiko.niranjana.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.eidiko.niranjana.entity.FileUploadEntity;
import com.eidiko.niranjana.service.FileUploadService;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadService service;
	
	@PostMapping("/upload")
	public String uploadForm(@RequestParam("files") List<MultipartFile> file,
			@RequestParam("accountNumber") String accountNumber,@RequestParam("destination") String destination) throws IOException
	{
	    
		 //read Content which is coming from POSTMAN
			System.out.println(accountNumber);	
			for(MultipartFile fileList : file)
			{
				System.out.println("All files are :"+fileList.getOriginalFilename());    //we get all the files here
								BufferedReader br;
								List<InputStream> result = new ArrayList<>();
								
								     String line;
								     InputStream is = fileList.getInputStream();
								     br = new BufferedReader(new InputStreamReader(is));
								     while ((line = br.readLine()) != null) 
								     {
								          result.add(is);
								     //     System.out.println("hhhhhhhhhhhhh"+result.toString());
								          System.out.println(is);
								         // is.close();
								     }
								     
				        					
			File fileUploadLocation = new File("C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\New folder");
			fileUploadLocation.getAbsolutePath();		
			//Now prepare Entity class object
			 FileUploadEntity info1=new FileUploadEntity();
			 info1.setAccountNumber(accountNumber);
			 info1.setDestination(destination);
			 info1.setFilePath(fileUploadLocation.getAbsolutePath().replace('\\','/') +"/"  +fileList.getOriginalFilename());
		
			 service.FileUploadInDB(info1);
			 }//for-loop close
			
		 return "uploaded";
	}//method close
}//class clsoe
package com.eidiko.niranjana.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.eidiko.niranjana.entity.ArtistDataTable;
import com.eidiko.niranjana.service.ArtistDataService;

@RestController
public class ArtistDataController {
	@Autowired
	private ArtistDataService service;
	
	@PostMapping("/insert")
	public String insertArtistDataIntoDBController(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("addrs") String addrs,@RequestParam("fileLocation") List<MultipartFile> files) throws IOException, SQLException 
	{
		System.out.println(name);
		System.out.println(addrs);
	
		
		for(MultipartFile fileList : files)
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
		          System.out.println("hhhhhhhhhhhhh"+result);
		         // is.close();
		     }
		 File fileuploadDestion = new File("C:\\Users\\Sreenivas Bandaru\\Downloads\\Eidiko\\New folder");
		 fileuploadDestion.getAbsolutePath();
		ArtistDataTable tableData = new ArtistDataTable();
		tableData.setId(id);
		tableData.setName(name);
		tableData.setAddrs(addrs);
		tableData.setFileLocation(fileuploadDestion.getAbsolutePath().replace('\\','/') +"/"  +fileList.getOriginalFilename());
		System.out.println("All the data:"+tableData);
		service.registerArtistDataIntoDB(id,name,addrs,fileuploadDestion.getAbsolutePath().replace('\\','/') +"/"  +fileList.getOriginalFilename());
		}
		return "uploaded";
	}
	
}

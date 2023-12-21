package com.eidiko.niranjana.controller;
import java.io.IOException;
import java.sql.SQLException;
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
	public String insertArtistDataIntoDBController(@RequestParam("name") String name,@RequestParam("addrs") String addrs,@RequestParam("photoLocation") MultipartFile photo) throws IOException, SQLException {
		System.out.println(name);
		System.out.println(addrs);
		String photoName = photo.getOriginalFilename();
		System.out.println(photoName);
		ArtistDataTable data = new ArtistDataTable();
		byte[] data1 = photo.getBytes();
		return service.registerArtistDataIntoDB(name, addrs, data1);
	}
	
	@PostMapping("/insertData")
	public ArtistDataTable insertArtistDataIntoDBController1(@RequestParam("name") String name,@RequestParam("addrs") String addrs,@RequestParam("photoLocation") MultipartFile photo) throws IOException, SQLException {
		System.out.println(name);
		System.out.println(addrs);
		String photoName = photo.getOriginalFilename();
		System.out.println(photoName);
		ArtistDataTable data = new ArtistDataTable();
		byte[] data1 = photo.getBytes();
		return service.registerArtistDataIntoDB1(name, addrs, data1);
		
	}

}

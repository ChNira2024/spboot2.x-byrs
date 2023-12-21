package com.eidiko.niranjana.dao;

import com.eidiko.niranjana.entity.ArtistDataTable;

public interface ArtistDataDAO {
	//insert into DB and return type is String
	public String insertArtistDataInDB(String name,String addrs,byte[] photo);
	
	//insert into DB and return type is Entity class
	public ArtistDataTable insertArtistDataInDB1(String name,String addrs,byte[] photo);
	

}

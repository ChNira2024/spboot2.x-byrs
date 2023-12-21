package com.eidiko.niranjana.dao;

import com.eidiko.niranjana.entity.ArtistDataTable;

public interface ArtistDataDAO {
	//insert into DB and return type is String
	public String insertArtistDataInDB(Integer id,String name,String addrs,String fileLocation);
	
}

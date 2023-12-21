package com.eidiko.niranjana.service;

import com.eidiko.niranjana.entity.ArtistDataTable;

public interface ArtistDataService {
	public String registerArtistDataIntoDB(String name,String addrs,byte[] photo);
	
	public ArtistDataTable registerArtistDataIntoDB1(String name,String addrs,byte[] photo);

}

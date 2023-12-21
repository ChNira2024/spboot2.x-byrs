package com.eidiko.niranjana.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eidiko.niranjana.dao.ArtistDataDAO;
import com.eidiko.niranjana.entity.ArtistDataTable;
@Service
public class ArtistDataServiceImpl implements ArtistDataService {

	@Autowired
	private ArtistDataDAO dao;
	@Override
	public String registerArtistDataIntoDB(String name, String addrs, byte[] photo) {
		dao.insertArtistDataInDB(name, addrs, photo);
		return "data inserted";
	}
	@Override
	public ArtistDataTable registerArtistDataIntoDB1(String name, String addrs, byte[] photo) {
		ArtistDataTable artistData=dao.insertArtistDataInDB1(name, addrs, photo);
		return artistData;
	}

}

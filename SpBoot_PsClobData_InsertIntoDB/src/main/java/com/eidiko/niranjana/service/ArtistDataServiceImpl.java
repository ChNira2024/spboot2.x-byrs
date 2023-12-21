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
	public String registerArtistDataIntoDB(Integer id,String name,String addrs,String fileLocation) {
		dao.insertArtistDataInDB(id,name,addrs,fileLocation);
		return "data inserted";
	}
	

}

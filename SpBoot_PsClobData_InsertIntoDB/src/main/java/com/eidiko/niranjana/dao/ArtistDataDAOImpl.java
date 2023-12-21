package com.eidiko.niranjana.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.ArtistDataTable;

@Repository
public class ArtistDataDAOImpl implements ArtistDataDAO {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public String insertArtistDataInDB(Integer id,String name,String addrs,String fileLocation) {
		String INSERT_QURY="INSERT INTO ARTIST_INFO_FILEPATH(ID,NAME,ADDRS,FILELOCATION) VALUES(?,?,?,?)";
		int count=0;
		count=jt.update(INSERT_QURY, id,name,addrs, fileLocation);
		System.out.println(count);
		return "Data inserted";
	}

	

}

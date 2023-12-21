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
	public String insertArtistDataInDB(String name, String addrs, byte[] photo) {
		String INSERT_QURY="INSERT INTO ARTIST_INFO_TABLE(ID,NAME,ADDRS,PHOTO) VALUES(ARTIST_ID.NEXTVAL,?,?,?)";
		int count=0;
		count=jt.update(INSERT_QURY,name, addrs,photo);
		System.out.println(count);
		return "Data inserted";
	}

	@Override
	public ArtistDataTable insertArtistDataInDB1(String name, String addrs, byte[] photo) {
		String INSERT_QURY="INSERT INTO ARTIST_INFO_TABLE(ID,NAME,ADDRS,PHOTO) VALUES(ARTIST_ID.NEXTVAL,?,?,?)";
		jt.update(INSERT_QURY,name, addrs,photo);
		return null;
	}

}

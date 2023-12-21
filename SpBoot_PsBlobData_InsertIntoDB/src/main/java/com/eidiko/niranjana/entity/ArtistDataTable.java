package com.eidiko.niranjana.entity;

import javax.persistence.Lob;

public class ArtistDataTable {
	
	private Integer id;
	private String name;
	private String addrs;
	
	@Lob
	private byte[] photo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	
	
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "ArtistDataTable [id=" + id + ", name=" + name + ", addrs=" + addrs + ", photo=" + photo + "]";
	}
	
		
	}

package com.eidiko.niranjana.entity;

public class ArtistDataTable {
	
	private Integer id;
	private String name;
	private String addrs;
	
	
	private String fileLocation;


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


	public String getFileLocation() {
		return fileLocation;
	}


	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
		
	}


	@Override
	public String toString() {
		return "ArtistDataTable [id=" + id + ", name=" + name + ", addrs=" + addrs + ", fileLocation=" + fileLocation
				+ "]";
	}

	
	
	
		
	}

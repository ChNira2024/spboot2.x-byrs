package com.eidiko.niranjana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.FileUploadEntity;
import com.eidiko.niranjana.repo.FileUploadRepo;
@Service
public class FileUploadSeviceImpl implements FileUploadService {

	@Autowired
	private FileUploadRepo repo;
	@Override
	public String FileUploadInDB(FileUploadEntity fileupload) {
		FileUploadEntity entity = repo.save(fileupload);
		if(fileupload!=null)
			return "file uploaded successfully ::"+fileupload.getId();
		else
		return "file uploaded successfully"; 
	}

}

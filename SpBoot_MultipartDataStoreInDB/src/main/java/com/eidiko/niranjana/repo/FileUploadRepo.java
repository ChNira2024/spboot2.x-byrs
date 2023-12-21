package com.eidiko.niranjana.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.FileUploadEntity;
@Repository
public interface FileUploadRepo extends JpaRepository<FileUploadEntity, Integer> {

	
}

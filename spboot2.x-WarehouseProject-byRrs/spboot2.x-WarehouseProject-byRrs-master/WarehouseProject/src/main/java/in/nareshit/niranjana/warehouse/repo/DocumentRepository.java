package in.nareshit.niranjana.warehouse.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.niranjana.warehouse.model.Document;

public interface DocumentRepository 
	extends JpaRepository<Document, Long> 
{

	@Query("SELECT docId,docName FROM Document")
	List<Object[]> getDocumentIdAndName();

}

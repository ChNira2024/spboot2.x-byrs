package in.nareshit.niranjana.warehouse.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.niranjana.warehouse.model.Document;
import in.nareshit.niranjana.warehouse.repo.DocumentRepository;
import in.nareshit.niranjana.warehouse.service.IDocumentService;

@Service
public class DocumentServiceImpl implements IDocumentService {

	@Autowired
	private DocumentRepository repo;
	
	public void saveDocument(Document doc) {
		repo.save(doc);
	}

	public List<Object[]> getDocumentIdAndName() {
		return repo.getDocumentIdAndName();
	}
	
	public void deleteDocumentById(Long id) {
		if(repo.existsById(id))
			repo.deleteById(id);
		else 
			throw new RuntimeException("Document Not exist");
	}
	
	public Document getDocumentById(Long id) {
		return repo.findById(id).orElseThrow(
				()->new RuntimeException("Document Not exist")
				);
	}

}

package in.nareshit.niranjana.warehouse.service;

import java.util.List;

import in.nareshit.niranjana.warehouse.model.Document;


public interface IDocumentService {

	void saveDocument(Document doc);
	List<Object[]> getDocumentIdAndName();
	void deleteDocumentById(Long id);
	Document getDocumentById(Long id);
}

package in.nareshit.niranjana.warehouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="doc_tab")
public class Document 
{
	@Id
	@Column(name="doc_id_col")
	private Long docId;

	@Column(name="doc_name_col")
	private String docName;
	
	@Lob
	@Column(name="doc_data_col")
	private byte[] docData;

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public byte[] getDocData() {
		return docData;
	}

	public void setDocData(byte[] docData) {
		this.docData = docData;
	}
	
	
}

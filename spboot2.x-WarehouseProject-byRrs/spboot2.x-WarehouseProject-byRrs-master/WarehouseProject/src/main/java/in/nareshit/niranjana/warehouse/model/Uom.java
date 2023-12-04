package in.nareshit.niranjana.warehouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="uom_tab")  //Unit of Measurement
public class Uom 
{
	@Id
	@GeneratedValue(generator = "uom_gen")
	@SequenceGenerator(name = "uom_gen",sequenceName = "uom_seq")
	@Column(name="uom_id_col")
	private Integer id;

	@Column(name="uom_type_col",nullable = false,length = 12)
	private String uomType;

	@Column(name="uom_model_col",nullable = false,length = 16,unique = true)
	private String uomModel;

	@Column(name="uom_desc_col",nullable = false,length = 110)
	private String uomDesc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getUomDesc() {
		return uomDesc;
	}

	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}
	
	
}

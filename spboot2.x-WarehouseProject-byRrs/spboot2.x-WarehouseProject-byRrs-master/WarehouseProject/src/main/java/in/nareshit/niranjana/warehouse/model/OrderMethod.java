package in.nareshit.niranjana.warehouse.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="order_method_tab")
public class OrderMethod 
{
	@Id
	@GeneratedValue(generator = "om_gen")
	@SequenceGenerator(name = "om_gen",sequenceName = "om_sql_gen")
	@Column(name="om_id_col")
	private Integer id;
	
	@Column(name="om_mode_col")
	private String orderMode;
	
	@Column(name="om_code_col")
	private String orderCode;
	
	@Column(name="om_type_col")
	private String orderType;
	
	@Column(name="om_desc_col")
	private String orderDesc;
	
	@ElementCollection  //this annotation helps to create a child table
	@CollectionTable(
			name="om_acpt_tab",  //child table name
			joinColumns =  @JoinColumn(name="om_id_col") //fk column name(parent table 'id' is the column)
			)
	@Column(name="om_acpt_col") //data column name
	private Set<String> orderAcpt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderMode() {
		return orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Set<String> getOrderAcpt() {
		return orderAcpt;
	}

	public void setOrderAcpt(Set<String> orderAcpt) {
		this.orderAcpt = orderAcpt;
	}
	
	
}

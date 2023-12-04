package in.nareshit.niranjana.warehouse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class SaleOrder 
{
	@Id
	@GeneratedValue(generator = "so_gen")
	@SequenceGenerator(name = "so_gen",sequenceName = "so_seq")
	@Column(name="so_id_col")
	private Integer id;
	
	private String orderCode;
	private String refNum;
	private String stockMode;
	private String stockSource;
	private String status;
	private String description;
	
	//Integrations
	//ShipmentType
	@ManyToOne
	@JoinColumn(name="st_id_fk_col")
	private ShipmentType st;
	
	//WhUserType
	@ManyToOne
	@JoinColumn(name="wh_cust_id_fk_col")
	private WhUserType customer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getRefNum() {
		return refNum;
	}

	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}

	public String getStockMode() {
		return stockMode;
	}

	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}

	public String getStockSource() {
		return stockSource;
	}

	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ShipmentType getSt() {
		return st;
	}

	public void setSt(ShipmentType st) {
		this.st = st;
	}

	public WhUserType getCustomer() {
		return customer;
	}

	public void setCustomer(WhUserType customer) {
		this.customer = customer;
	}
	
	
}

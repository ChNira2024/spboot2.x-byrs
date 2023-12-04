package in.nareshit.niranjana.warehouse.service;

import java.util.List;
import java.util.Optional;

import in.nareshit.niranjana.warehouse.model.PurchaseDtl;
import in.nareshit.niranjana.warehouse.model.PurchaseOrder;


public interface IPurchaseOrderService {

	Integer savePurchaseOrder(PurchaseOrder po);
	
	PurchaseOrder getOnePurchaseOrder(Integer id);
	List<PurchaseOrder> getAllPurchaseOrders();
	boolean isPurchaseOrderCodeExist(String code);
	boolean isPurchaseOrderCodeExistForEdit(String code,Integer id);

	//---for screen#2-------------------------------
	Integer savePurchaseDtl(PurchaseDtl pdtl);
	List<PurchaseDtl> getPurchaseDtlsByPoId(Integer id);	
	void deletePurchaseDtl(Integer dtlId);
	
	//for status read and update
	String getCurrentStatusOfPo(Integer poId);
	void updatePoStatus(Integer poId,String newStatus);
	
	Integer getPurchaseDtlsCountByPoId(Integer poId);
	
	//for checking part added for PO or not 
	Optional<PurchaseDtl> getPurchaseDtlByPartIdAndPoId(Integer partId, Integer poId);
	Integer updatePurchaseDtlQtyByDtlId(Integer newQty,Integer dtlId);
}

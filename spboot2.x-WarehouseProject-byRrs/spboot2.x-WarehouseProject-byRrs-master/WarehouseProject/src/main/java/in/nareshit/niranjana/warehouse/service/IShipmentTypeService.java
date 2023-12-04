package in.nareshit.niranjana.warehouse.service;

//ctrl+shift+O
import java.util.List;
import java.util.Map;

import in.nareshit.niranjana.warehouse.model.ShipmentType;


public interface IShipmentTypeService {

	Integer saveShipmentType(ShipmentType st);
	void deleteShipmentType(Integer id);
	void updateShipmentType(ShipmentType st);
	
	
	List<ShipmentType>  getAllShipmentTypes();
	ShipmentType getShipmentType(Integer id);
	
	boolean isShipmentTypeCodeExist(String code);
	
	boolean isShipmentTypeCodeExistForEdit(String code,Integer id);
	
	List<Object[]> getShipmentTypeModeAndCount();
	
	//for Dynamic DropDown
	Map<Integer,String> getShipmentIdAndCodeByEnable(String enable);
}

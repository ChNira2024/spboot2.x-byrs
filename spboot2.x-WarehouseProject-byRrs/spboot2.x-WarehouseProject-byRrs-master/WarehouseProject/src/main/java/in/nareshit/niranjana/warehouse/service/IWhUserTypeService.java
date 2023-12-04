package in.nareshit.niranjana.warehouse.service;

import java.util.List;
import java.util.Map;

import in.nareshit.niranjana.warehouse.model.WhUserType;


public interface IWhUserTypeService {  

	Integer saveWhUserType(WhUserType whut);
	List<WhUserType> getAllWhUserTypes();
	void deleteWhUserType(Integer id);
	WhUserType getOneWhUserType(Integer id);
	void updateWhUserType(WhUserType whut);

	boolean isWhUserTypeCodeExit(String code);
	boolean isWhUserTypeCodeExitForEdit(String code,Integer id); 

	boolean getWhUserTypeuserEmailCount(String email);
	boolean getWhUserTypeuserEmailCountForEdit(String email, Integer id);

	boolean getWhUserTypeuserIdNumCount(String idnum);	
	boolean getWhUserTypeuserIdNumCountForEdit(String idnum, Integer id);

	List<Object[]> getWhUserTypUserIDAndCount();

	//for integration
	Map<Integer,String> getWhUserIdAndCodeByType(String type);
	
}
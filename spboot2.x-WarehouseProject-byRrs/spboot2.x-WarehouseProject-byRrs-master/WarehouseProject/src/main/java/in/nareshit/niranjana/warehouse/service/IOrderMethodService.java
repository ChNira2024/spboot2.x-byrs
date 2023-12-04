package in.nareshit.niranjana.warehouse.service;

import java.util.List;
import java.util.Map;

import in.nareshit.niranjana.warehouse.model.OrderMethod;


public interface IOrderMethodService {

	Integer saveOrderMethod(OrderMethod om);
	void updateOrderMethod(OrderMethod om);
	void deleteOrderMethod(Integer id);
	
	OrderMethod getOneOrderMethod(Integer id);
	List<OrderMethod> getAllOrderMethods();
	boolean isOrderMethodCodeExist(String code);
	boolean isOrderMethodCodeExistForEdit(String code,Integer id);
	
	List<Object[]> getOrderMethodModeAndCount();
	Map<Integer,String> getOrderMethodIdAndCode();
}

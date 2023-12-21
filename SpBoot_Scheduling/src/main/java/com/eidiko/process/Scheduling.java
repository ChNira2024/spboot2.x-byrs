package com.eidiko.process;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {

//	@Scheduled(initialDelay=3000)		//error: because we need one of them of fixedDelay or fixedRate
//	public void generateReports()
//	{
//		System.out.println("sales report on :"+new Date());
//	}
	
//	@Scheduled(initialDelay=2000,fixedDelay=3000)				//1000ms---->1sec
//	public void generateSalesReport()
//	{
//		System.out.println("sales report on1 :"+new Date());
//	}
//==============================================================================

//	@Scheduled(initialDelay=2000,fixedDelay=3000)				//1000ms---->1sec
//	public void generateSalesReport1()
//	{
//		System.out.println("sales report on1 :"+new Date());
//		try {
//			Thread.sleep(5000);	//5 sec
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//===================================================================================	
//	@Scheduled(fixedRate=5000)				//1000ms---->1sec   //fixedRate doesnot work for sleep because sleep is less than fixedRate
//	public void generateSalesReport2()
//	{
//		System.out.println("report starts on2 :"+new Date());
//		try {
//			Thread.sleep(3000);	//3 sec
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//===========================================================================================
	@Scheduled(cron="5 * * * * *")
	public void generateSalesReport3()
	{
		System.out.println("reports starts on3 :"+new Date());
	}
//==============================================================================================
	@Scheduled(cron="30 32 16 * * *")
	public void generateSalesReport4()
	{
		System.out.println("reports starts on4 :"+new Date());
	}
//========================================================================================
	@Scheduled(cron="0 0 9 * * *")
	public void generateSalesReport5()
	{
		System.out.println("reports starts on5 :"+new Date());
	}
//=======================================================================================
	@Scheduled(cron="1 2 17 * * *")
	public void generateSalesReport6()
	{
		System.out.println("reports starts on6 :"+new Date());
	}
//===================================================================================
	@Scheduled(cron="0 2 8 10 * *")
	public void generateSalesReport7()
	{
		System.out.println("reports starts on7 :"+new Date());
	}
//================================================================================
	@Scheduled(cron="0 2 8,10 * * *")
	public void generateSalesReport8()
	{
		System.out.println("reports starts on8 :"+new Date());
	}
//===============================================================================	
	@Scheduled(cron="10 20 9-14 * * *")
	public void generateSalesReport9()
	{
		System.out.println("reports starts on9 :"+new Date());
	}
//============================================================================
	@Scheduled(cron="0 0 16 * * *")
	public void generateSalesReport10()
	{
		System.out.println("reports starts on10 :"+new Date());
	}
//=========================================================================
	@Scheduled(cron="1 2 5 6 * *")
	public void generateSalesReport11()
	{
		System.out.println("reports starts on11 :"+ new Date());
	}
	@Scheduled(cron="0 2 8-10 5 * 5")// we can't pass any value..after * symbol
	public void generateSalesReport()
	{
		System.out.println("reports starts on :"+new Date());
	}
	@Scheduled(cron="8 5 18 * * *")
	public void reportsGenarate()
	{
		System.out.println("reports generated on :"+new Date());
		System.out.println();
	}
	
	@Scheduled(cron="0 /1 * * * *")
	public void runEveryFiveMinutes()
	{
		System.out.println("run every 5 minutes :"+new Date());
	}
}

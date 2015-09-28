package com.hdfc.los.helper;

import java.util.Scanner;

import com.hdfc.los.dto.Customer;
import com.hdfc.los.dto.Stage;

public class StageHelper {

	 Customer customerArray[] = new Customer[5];
	
	StageHelper()
	{
		for(int i = 0; i<5; i++){
			Customer customer = new Customer();
			customer.setAppNo(10+i);
			customer.setName("Ram"+i);
			Stage stage = new Stage();
			if(i<2){
			stage.setCurrentStage("QDE");
			stage.setNextStage("Dedupe");
			stage.setPrevStage("Sourcing");
			}
			else{
				stage.setCurrentStage("Scoring");
				stage.setNextStage("Loan Approval");
				stage.setPrevStage("QDE");
				}
			customer.setStage(stage);
			customerArray[i]=customer;
		}
	}
	public  Customer getCurrentStage(int appNo)
	{
		for(Customer customer : customerArray){
			if(customer.getAppNo()==appNo){
				return customer;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StageHelper helper = new StageHelper();
		System.out.println("Enter the AppNo");
		int appNo = scanner.nextInt();
		Customer customer = helper.getCurrentStage(appNo);
		if(customer!=null){
			System.out.println("Welcome Back Customer "+customer.getName());
			System.out.println("Your Current Stage is "+customer.getStage().getCurrentStage());
			System.out.println("Your Prev Stage is "+customer.getStage().getPrevStage());
			System.out.println("Your Next Stage is "+customer.getStage().getNextStage());
		}
		else
		{
			System.out.println("Not Found... U r a New Customer");
		}

	}

}

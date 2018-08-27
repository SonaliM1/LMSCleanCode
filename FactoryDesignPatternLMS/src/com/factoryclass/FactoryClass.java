package com.factoryclass;

import java.util.Scanner;

import com.library.factoryinterface.searchInterface;

public class FactoryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchCatagoryFactory searchCatagoryFactory = new SearchCatagoryFactory();
		
		System.out.println("Enter the Book Catagory for search");
		Scanner scan = new Scanner(System.in);
		String catogory=scan.nextLine();
		
		if(catogory.equalsIgnoreCase("Horror")){
			searchInterface searchHorror = searchCatagoryFactory.getsearch("Horror");
			searchHorror.search("Horror");
		}else if (catogory.equalsIgnoreCase("Drama")) {
			
			searchInterface searchDrama = searchCatagoryFactory.getsearch("Drama");
			searchDrama.search("Drama");
		}else if (catogory.equalsIgnoreCase("Adventure")) {
			
			searchInterface searchAdventure = searchCatagoryFactory.getsearch("Adventure");
			searchAdventure.search("Adventure");
		}
		else {
			System.out.println("Search Book Not available ..");
		}
	
	}

}

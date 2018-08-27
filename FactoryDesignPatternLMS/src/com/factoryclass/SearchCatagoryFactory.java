package com.factoryclass;

import com.library.concreateclass.Adventure;
import com.library.concreateclass.Drama;
import com.library.concreateclass.Horror;
import com.library.factoryinterface.searchInterface;

public class SearchCatagoryFactory  {

	public searchInterface getsearch(String bookType) {
		if (bookType == null) {
			return null;
		}
		if (bookType.equalsIgnoreCase("Horror")){
			return new Horror();
			
		}else if (bookType.equalsIgnoreCase("Drama")) {
			return new Drama();
			
		}else if (bookType.equalsIgnoreCase("Adventure")) {
			return new Adventure();
		}

		return null;
	}

}

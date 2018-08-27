package com.library.concreateclass;

import java.util.ArrayList;
import java.util.List;


import com.library.factoryinterface.searchInterface;
import com.library.model.Book;

public class Horror implements searchInterface {

	@Override
	public void search(String catagory) {
		// TODO Auto-generated method stub
		System.out.println("search For Horror");
		
		 List<Book> horrorBookList =new ArrayList<>();
		    Book b1=new Book(1, "XYZ","Horror");
			Book b2=new Book(2, "ABC","Drama");
			Book b3=new Book(3, "LMN","Adventure");
			horrorBookList.add(b1);
			horrorBookList.add(b2);
			horrorBookList.add(b3);
			
			horrorBookList.stream().filter(n->n.getCatagory()==catagory).forEach(System.out::println);
			//bookList1.forEach(s->System.out.print(s + " "));
	}
}

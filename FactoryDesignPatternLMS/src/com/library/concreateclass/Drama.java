package com.library.concreateclass;

import java.util.ArrayList;
import java.util.List;

import com.library.factoryinterface.searchInterface;
import com.library.model.Book;



public class Drama implements searchInterface {

	@Override
	public void search(String catagory) {
		// TODO Auto-generated method stub
		
		System.out.println("search For Drama");
		
		List<Book> dramaBookList = new ArrayList<>();
		 Book b1=new Book(1, "XYZ","Horror");
			Book b2=new Book(2, "ABC","Drama");
			Book b3=new Book(3, "LMN","Adventure");
			dramaBookList.add(b1);
			dramaBookList.add(b2);
			dramaBookList.add(b3);
			dramaBookList.stream().filter(n->n.getCatagory()==catagory).forEach(System.out::println);
	}
}

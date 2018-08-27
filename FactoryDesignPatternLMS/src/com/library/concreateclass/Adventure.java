package com.library.concreateclass;

import java.util.ArrayList;
import java.util.List;


import com.library.factoryinterface.searchInterface;
import com.library.model.Book;

public class Adventure implements searchInterface{

	@Override
	public void search(String catagory) {
		// TODO Auto-generated method stub
		System.out.println("search For Adventure");
		List<Book> adventureBookList =new ArrayList<>();
		 Book b1=new Book(1, "Computer Science","Horror");
			Book b2=new Book(2, "Electronics","Drama");
			Book b3=new Book(3, "Statistics","Adventure");
			adventureBookList.add(b1);
			adventureBookList.add(b2);
			adventureBookList.add(b3);
			adventureBookList.stream().filter(n->n.getCatagory()==catagory).forEach(System.out::println);
	}

}

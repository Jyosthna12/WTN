package oopsinheritance.encapsulation;

public class Book {
	String name1;
	String author;
	double price;
	int qtyInStock;
	Book(String n1)
	{
	 name1=n1;
	 
	}
	void setqtyInStock()
	{
	 qtyInStock=10;
	}
	void setprice()
	{
	 price=100.0;
	}
	double getprice()
	{
	 return price;
	}
	int getqtyInStock()
	{
	 return qtyInStock;
	}
	String getname1()
	{
	 return name1;
	}
	void getAuthor()
	{
	 System.out.println("Author name is:+Author.name");
	 System.out.println("Mail id is:+Author.email");
	 System.out.println("Gender is:+Author.gender");
	}

}

package oopsinheritance.encapsulation;

public class Books {
	public static void main(String args[])
	{
	 Book b=new Book("Communication Systems");
	 b.setprice();
	 b.setqtyInStock();
	 System.out.println("The name of the Book is:"+b.getname1());
	 System.out.println("The price of the Book is:"+b.getprice());
	 System.out.println("The stock is:"+b.getqtyInStock());
	 
	}

}

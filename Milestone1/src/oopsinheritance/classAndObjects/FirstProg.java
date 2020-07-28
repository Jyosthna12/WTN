package oopsinheritance.classAndObjects;

public class FirstProg {

	double H,W,D;
	
	    FirstProg(double Height,double Width ,double Depth)
	  {
	     H=Height;
	      W=Width;
	      D=Depth;
	  }
	     double volume()
	     { 
	      double volume;
	         volume=H*W*D;
	         return volume;
	     }
	     public static void main(String[] args) 
	     {
	      FirstProg box = new FirstProg(7.5,77.3,7.6);
	         System.out.println(box.volume());
	     }
}

class H
{
	int x;
{
	class I implements Cloneable
	{
		H h1;//DERIVED ATTRIBUTE
	 
	public static void main(String[] args) 
	{
	  I obj1=new I();
	  obj1.h1=new H();
	  obj1.h1.x=10;

	  I obj2= (I)obj1.Clone();

		System.out.println(1 + ":" +obj2.h1.x);
		obj1.h1.x=20;
		System.out.println(2 + ":" +obj2.h1.x);
		obj1.h1.x=30;
		System.out.println(3 + ":" +obj2.h1.x);
		
	}
	}
  
}
  }

/* shalocopy is a derived attribute */
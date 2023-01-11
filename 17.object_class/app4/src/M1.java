class A
{
	//protected void finalize()
		public void finalize()
	{
       System.out.println("FORM FINAIZE");
	}
}
class M1
{
	public static void main(String[] args) 
	{
		A a1=new  A();
		a1=null;
		 
		 for (int i=0; i<=1000; i++ )
		{
			 System.out.println(i)
		}
	
		System.out.println("program end");
	}
}


/* for one object we can have any refarence .
that object becomes abandede object 
 date object 
 onces the object becomes abanded then it is eligible for garbage collector
 abanded also called as garbage objects 
 once an object becomes garbage object in java there is one thred called garbage collector
 it is a internal demanthread
 once in a while 
 it wil be going to the heap memory to chech any abanded object is their or not
 if their are any abanded objects are their it will be calling finaize object on that object to chech 
 after calling the finalize method if the object is still abanded that it will remove the object from the memory
 demonthread is a thread its life dependes on parent thread ife.
 memory management is taken by the garbage collector internally
 finalize method is protected 
*/
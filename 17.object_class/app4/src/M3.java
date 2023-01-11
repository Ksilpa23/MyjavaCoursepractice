class Util
{
	staic void sleep(long millis)
	{
		try
		{
				Thread. sleep(millis)
			}
				catch (InterruptedException ex)
			{
				ex.printstacktrace();
			}
		}

}
class c
{
	static C obj;

	protected void finaize()
	{
		obj =this;
		System.out.println("from finaize()");
	}
}
class M3 
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(1 + ":" + c1);
		System.out.println(2 + ":" + C.obj);
		Util.sleep(1000);

		c1=null;

		System.gc();

        Util.sleep(1000);
		System.out.println(3 + ":" + c1);
		System.out.println(4 + ":" + C.obj);

		C.obj=null;
        
		Util.sleep(1000);

		System.gc();
		
		System.out.println( 5+ ":" +c1);
		System.out.println(6+ ":" +C.obj);
		System.out.println("end");

	}
}


/* 
dead is comming to the
  
regalacted object */

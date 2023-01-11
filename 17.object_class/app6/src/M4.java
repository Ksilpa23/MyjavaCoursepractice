import java.lang.reflect.Method;
 class  A
 {
	 void test1()
	 {
	 }

	 int test2()
	 {
		 return 200;
	 }
	 String test3()
	 {  
		 try
		 {
			return super.Clone();
		 }
		 catch (Exception e)
		 {
			 return null;
		 }

		 }
		 public void finalize()
	 {
			 System.out.println("FROM FINALIZE");
	 }
 }
 class M4
 {
   public static void main(String[] args) 
	{
	   A a1=new A();
	   String s1="hello";
	   Integer i=200;

	   Class C1=a1.getClass();
	   Method[] methods=C1.getMethods();

	   for(Method method : methods)
		{
		 System.out.println(method.getName() + "::" + method.getReturnType());
		 System.out.println("------------");

		}
	}
}

/*

*/

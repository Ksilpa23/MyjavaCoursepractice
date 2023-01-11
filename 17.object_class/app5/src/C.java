class C implements Cloneable 
{
	public static void main(String[] args) throws Exception
	{
		C c1=new C();
		C c2=(C)c1.clone();

		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);

		System.out.println("done");
	}
}
/*
 marker inter face is an interface which doesn"t contains 
 it is an emty inter face it is only providing a type
 
 c is stype of clonable is markerintrface just providing run time environment

 */
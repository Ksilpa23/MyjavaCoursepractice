//Reflection ApI
class A 
{ 
	int param1;
	String firstName;
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 =new A();
		//returns class object that repracents the runtime 
		// class of this object.
		Class c1=a1.getClass();
		System.out.println(c1.getName());
	}
}

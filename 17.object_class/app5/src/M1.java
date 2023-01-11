class A
{
}
class M1
{
	public static void main(String[] args) 
	{
		A a1=new A ();
		A a2=a1.clone();//protected
		System.out.println(a1);
		System.out.println(a2);

	}
}

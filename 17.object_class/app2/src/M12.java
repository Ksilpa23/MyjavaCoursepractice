class C
{
	int i;
	double j;
	boolean K;
	char C;

	C(int i,double j,boolean K,char C)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		this.C=C;

	public boolean equals(Object obj)
	{
		return (this.i==((C)obj).i&& this.j==((C)obj).j&& this.K==((C)obj).K&& this.C==((C)obj).C);
	

	}
	
}
class M12
{
	public static void main(String[] args)
	{
		C C1=new c(10,2.5,true,'a');
		C C2=new c(20,2.5,true,'a');

		System.out.println(C1==C2); //false
		System.out.println(C1.equals(c2));  

		System.out.println(C1.i==c2.i&&C1.j==C2.j&& C1.k==C2.k&&C1.C==C2C);

		C C3=C2;

		System.out.println(C3==C2); //true
		System.out.println(C3.equals(c2));

		System.out.println(C3.i==c2.i&&C3.j==C2.j&& C3.k==C2.k&&C3.C==C3C);


	}

		


}
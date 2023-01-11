class K
{
	int i;
}

class M9
{
	public static void main(String[] args)
	{
		K K1 = new K();
		K1.i = 10;

		K.k2 = new k();
		k2.i = 10;

    System.out.println(K1 == K2);

	System.out.println(K1.Equals(K2));

	         K K3 = K1;
	 
     System.out.println(K3 == K1);

	System.out.println(K3.equals(K1));
	}
}

/*
1. equals method used to check equality of two objects.
2. if our class doesnt contain equals method then object class equals method will
   be executed.
3. by default object class equals method compares the object reference not the 
   content of the objects.
4. if you are comparing two references by using == operator it will check whether
   these two references are pointing to the same object or not and will return the
   boolean result.
 */

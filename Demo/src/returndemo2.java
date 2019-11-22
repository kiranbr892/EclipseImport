
public class returndemo2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stu
		System.out.println("enter to the main()");
		int k= m1(35);
		System.out.println("value of k is"+k);
		System.out.println("end of main()");	

	}
	 static int m1(int a)
	{ 
		 int p= 0;
		System.out.println("enter to the m1()");
		if(a>0 && a<10)
		{
			System.out.println("value is betwn 0 and 10");
			p+=1;
			return p;
		}
		else if (a>10 && a<20)
		{
			System.out.println("value is betwn 10 and 20");
			p+=2;
			return p;
		}
		else if(a>20 && a<30)
		{
			System.out.println("value is betwn 20 and 30");
			p=+3;
			return p;
		}
		System.out.println("end of m1()");
		return p;
		
		
		
	}

}

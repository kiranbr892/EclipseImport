
public class Methodsdemoarray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		m1(a);
		
		
		//x[3]=250;
		//x[4]=200;
		System.out.println("value of a[2]is"+a[2]);
		System.out.println("value of a[0]is"+a[0]);
		//System.out.println("value of x[3]is"+x[3]);
		///System.out.println("value of a[5]is"+a[4]);
	}
		static int[] m1(int b[])
		{
			
			for(int i:b)
			{
				System.out.println("value of b is" +i);
			}
		b[2]=100;
		b[0]=50;
		return b;
		}

	
		

	}

	

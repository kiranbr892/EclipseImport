
public class Methodparameterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a[];
		a=new int[3];
		a= m1(null);

		for (int i:a)
		{
			System.out.println(i);
		}
		
	}
	static int[] m1(int x[])
	{
		x=new int[3];
		x[0]=15;
		x[1]=20;
		x[2]=30;
		
		return x;
	}

}

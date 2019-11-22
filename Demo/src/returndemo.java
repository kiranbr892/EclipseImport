
public class returndemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=2;
		int b=5;
		int c=fun(a,b);
		System.out.println("value of c is"+c);

	}
	static int fun(int x,int y)
	 {
		int z=x+y;
		System.out.println(z);
		return z;
	 }
	static int fun1(int m,int n)
	 {
		int k=m*n;
		return k;
	 }
	
	

}

class Computation{
	
	public static int add(int num1, int num2)
	{
		return  num1 + num2;
	}
	
	public static int sub(int num1, int num2)
	{
		return  num1 - num2;
	}
	
	public static void main(String args[])
	{
		
		System.out.println("Welcome to Computation Program");
		int sum=add(10,20);
		System.out.println("Sum is: "+sum);
		
		int sub=sub(10,20);
		System.out.println("Sub is: "+sub);
		
	}
	
}



int num1=1
int num2=2
.
.
.
.
.
.
.
int num100=100;

System.out.println(num2);


Arrays : Collection of similar elements with same name
		 Using Index : Ref / pointer
		 0 to length -1
		 0 1 2 3 4
		 
	datatype array-name[] = new datatype[size];
	
	int numbers[] = new int[10];  10 X 4 Bytes ==> 0, null,0.0
		 

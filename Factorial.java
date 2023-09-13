import java.util.Scanner;

class Factorial{
	public int fact(int a){
		if(a!=1)
			return a*fact(a-1);
		else
			return 1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter number:");
		a=sc.nextInt();
		
		Factorial f=new Factorial();
		int fact=f.fact(a);
		System.out.print("Factorial="+fact);
	}
}
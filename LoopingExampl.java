package javaexampl;

public class LoopingExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingExampl l=new LoopingExampl();
	//	l.find_armstrong(153);
//l.find_palindrome(1001);
		//l.sumofmulofthree(123);
		l.even_position_sum(1234);
		l.count_of_digits(1234);
		l.print_reverse(123);
	}
	private void print_reverse(int plate) {
		// TODO Auto-generated method stub
		while(plate>0)
		{
		System.out.print(plate%10); 
		plate = plate / 10; 
		}
		
	}

	private void count_of_digits(int plate) {
		// TODO Auto-generated method stub
		int count_of_digits = 0; 
		while(plate>0)
		{
		//System.out.println(plate%10); 
		
		plate = plate / 10; 
		count_of_digits = count_of_digits + 1; 
		}
		System.out.println("Digits count is " + count_of_digits);
	}
	private void even_position_sum(int plate) {
		// TODO Auto-generated method stub
		int sum=0;
		while (plate>0) {
			int no=plate/10;//123
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			plate=no;
			
		}
			System.out.println(sum);
		
	}
	private void sumofmulofthree(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0){
		int rem=num%10;
		if(rem%3==0) {
		sum=sum+rem;
		}
		num=num/10;
		}
		System.out.println(sum);
		
	}
	private void find_armstrong(int plate1) {
		// TODO Auto-generated method stub
		int plate3 = plate1; 
		int plate2 = 0; //12345

		while(plate1>0)
		{
		int rem = plate1%10;	//4
		plate2 = plate2 + (rem*rem*rem); 	//27 + 125 + 1
		plate1 = plate1/10; 	//1234
		}
		System.out.println("plate1 " + plate1);
		System.out.println("plate2 " + plate2); 
		if(plate3 == plate2)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
		
	}
	private void find_palindrome(int plate1) {
		// TODO Auto-generated method stub
		int plate3 = plate1; 
		int plate2 = 0; //12345

		while(plate1>0)
		{
		int rem = plate1%10;	//4
		plate2 = (plate2*10) + rem; 	
		plate1 = plate1/10; 	//1234
		}
		System.out.println("plate1 " + plate1);
		System.out.println("plate2 " + plate2); 
		if(plate3 == plate2)
		{//101
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}

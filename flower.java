package javaexampl;
public class flower{
	public static void main(String[] args)
	{
		flower f=new flower();
	//	f.flower_count();
	//	f.tenali_story_2();
	//	f.dad_daughter();
		//f.countDivisorOfANumber();
		//f.print_divisors(50);
		//print_multiples_3_or_5();
		f.print_3691215_2();
	}
	private void print_3691215_2() {
		// TODO Auto-generated method stub
		int no = 1;
		while(no<=5){
		System.out.print((no*3)+ " "); 
		no = no + 1; 
		}
		
	}

		private  void flower_count() {
			// TODO Auto-generated method stub
			int temple = 7; 
			int flower = 1;
			while(temple>0)
			{
			flower = flower * 2; 
			temple = temple - 1; 
			}
			System.out.println("Initially "+ flower); 	

	}
		private void tenali_story_2() {
			// TODO Auto-generated method stub
			int beat = 1024; 
			int security_count = 0;
			while(beat>1)
			{
		//	System.out.println("Security gets " + (beat/2)); 
			security_count = security_count + 1; 
			beat = beat / 2; 
			}
	System.out.println("No. of Securities "+ security_count);	
			System.out.println("One for Me"); 
			
		}
		private void dad_daughter() {
			// TODO Auto-generated method stub
			int purse = 0; 
			int day = 1; 
			while(day<=10)
			{
			purse = purse + day; 
			day = day + 1; 
			}
			System.out.println(purse);
		}
		private void countDivisorOfANumber() {
			// TODO Auto-generated method stub
			int no = 1;
			int divisor = 5;
			int count = 0;
			while(no <= 100) {
				if (no % divisor == 0) {
					
	//System.out.println
	//( no + " is divisor of "+ divisor );
					count = count+1;
				}
				no = no+1;			
			}
			System.out.println( " total number of divisible numbers are "+ count  );
			
		}
		private void print_divisors(int no) {
			// TODO Auto-generated method stub
			int div = 2; 
			while(div<=no)
			{
			if(no%div == 0)
			{
			System.out.print(div+" "); 
			}
			div = div + 1; 
			}
			
		}
		private static void print_multiples_3_or_5() {
			// TODO Auto-generated method stub
			int no = 1; 
			while(no<=30){
			if(no%3==0 || no%5==0)
			{
			System.out.println(no); 
			}
			no = no + 1; 
			}
		}
		
}
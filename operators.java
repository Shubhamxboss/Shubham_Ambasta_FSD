package mypackage;
import java.util.Scanner;
public class operators

{
	public static void main(String [] args) 
	
	{
		
		//Taking input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int s = sc.nextInt();
		if(s>5) {
			//incrementing
			s++;
			System.out.println("inside increment loop\t"+s);
		
	}
		
		if(s<5) {
			//decrementing
			s--;
			System.out.println("inside decrement loop\t"+s);
		}
		//factorial of the given number
		
		int i,fact = 1;
		int number = s;
		for(i=1;i<number;i++)
		{
			fact=fact*i;
		}
		
		
		
		
		
		
		
		
		//multiplication
		
		multiplication();
		
	 }
	
	
	public static void multiplication() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Please Enter number for multiplication\n");
		int num;
		num = sca.nextInt();
		int i = 1;
        while(i <= 10)
        {
        	int p;
        	p = num*i;
            System.out.printf("%d * %d = %d \n", num, i, p);
            i++;
        }
	}
	
	//permutation and combination
	
	
	
	
	
	
	
	
}
	
//String Pool in java
/*-------------------*/

/*String pool is nothing but a storage area in Java heap where string literals stores. 
 * It is also known as String Intern Pool or String Constant Pool. It is just like object allocation. 
 * By default, it is empty and privately maintained by the Java String class.
 * Whenever we create a string the string object occupies some space in the heap memory. 
 * Creating a number of strings may increase the cost and memory too which may reduce the performance also.
 * 
 * 
 * ----------- STRINGS IN JAVA ---------------
 * 
 * A Java string is a sequence of characters that exist as an object of the class java.
 * java strings are created and manipulated through the string class. 
 * Once created, a string is immutable -- its value cannot be changed
 * 
 * 
 * 
 * -------------- JAVA WRAPPER CLASS ---------------------------
 * Data Type                    Wrapper Class       Memory Size
 * 
 * byte                -        Byte                    1 byte   
 * short               -        Short                   2 byte
 * int                 -        Integer                 4 byte
 * long                -        Long                    8 byte
 * float               -        Float                   4 byte
 * double              -        Double                  8 byte
 * boolean             -        Boolean                 1 bit
 * char                -        Character               2 byte
 * 
 * 
 */
	





	




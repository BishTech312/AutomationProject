package test.java.advanced_group;


public class Class2 {
	
	public static int gcd(int n1, int n2) { // while loop
		int gcd =1; //Initial gcd is 1
		int k =2;// Possible gcd
		
		while (k <=n1 && k <= n2) {
			if(n1 % k ==0 && n2 % k ==0)
				gcd =k; //Update gcd
			k++;
		}
		return gcd;
	}
	
	public static boolean isPrime(int number) { //for loop
		for(int divisor =2; divisor <= number / 2 ; divisor ++) {
			if(number % divisor ==0) { //if true,number is not prime
				return false; //number is not prime
			}
		}
		return true; // number is prime
	}
	
	public static int maximum(int[] numbers) { // for each loop 
      
        int maxNum = numbers[0]; 
          
        
        for (int num : numbers)  {
         
            if (num > maxNum) {
             
                maxNum = num; 
            } 
        } 
    return maxNum; 
    } 
	public static int even() {  //while loop
		
		int i =1;
		while (i <=20) {
			if(i % 2 == 0) {
			System.out.println(i);	
			}
			i++;
		}
		return 0;
	}
	
	

}
	
	
	
	
	


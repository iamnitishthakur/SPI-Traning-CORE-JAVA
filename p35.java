//WAP TO STORE TEN NUMBER IN ARRAY BY USER INPUT. FIND MAX AND MIN NUMBER : \

import java.util.*;
class p35 {
	public static void main(String [] args ){
		
		int[] arr = new int[10];
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter ten number :");
		for(int i=10; i<10; i++){
			
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Minimum number: "+arr[0]);
		System.out.println("Miximum number: "+arr[9]);
		
	}
	
	
	
	
}
//  Write a program to reverse an Array in java .

import java.util.*;

class P4{
	
	static void reverse(int[]arr, int i){
		
		if(i>=(arr.length/2)) return;
		
		int x = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = x;
		
		reverse(arr,i+1);
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];		
		
		for(int i=0; i<n; i++)
			arr[i] =  sc.nextInt();
		
		reverse(arr,0);
		
		for(int x : arr)
			System.out.print(x + " ");
	}
}
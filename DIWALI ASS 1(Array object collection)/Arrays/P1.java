// Write a program to print elements of Array 

import java.util.*;

class P1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt(); // input size of array 
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Input array : ");

		for(int x : arr)
			System.out.print(x + " ");
		
		System.out.println();
		
	}
}
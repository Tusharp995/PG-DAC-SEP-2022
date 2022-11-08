//  Write a Java program to check the equality of two arrays?

class P2{
	
	public static void main(String[] args){
		
		int arr1[] = {1, 5, 7, 9, 23};
		int arr2[] = {1, 5, 7, 9, 23};
		
		System.out.println("arr1 == arr2 returns: " + (arr1 == arr2)); // reference comparision: so they are not same
		
		// self designed deep comparison
		int count = 0;	
		if(arr1.length != arr2.length) {
			System.out.println("Unequal Arrays");
		}
		else {
			
			for(int i=0; i<arr1.length; i++) 
				if(arr1[i] != arr2[i])
					break;
				else 
					count++;
			if(count == arr1.length)
				System.out.println("Equal Arrays");
			else
				System.out.println("Unequal Arrays");
		}
	}
}
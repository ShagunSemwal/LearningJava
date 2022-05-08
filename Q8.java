package Assignment_01;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Before removing the element: "+Arrays.toString(arr));
		
		int index =  3;
		for(int i= index ; i< arr.length-1;i++)
			arr[i]= arr[i+1];
	
		System.out.println("after removing 3rd index element: "+Arrays.toString(arr)); //We cannot alter the size of an array , 
		//after the removal, the last and second last element in the array will exist twice

	}

}
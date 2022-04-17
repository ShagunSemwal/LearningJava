package Unit_01;
import java.util.Arrays;
import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		Arrays.sort(arr);
		
		System.out.println("sorted array: ");
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		System.out.println("duplicate elements: ");
		
		for(int i=0 ,j =i+1 ; i<arr.length && j<arr.length   ; i++ , j++) {
			if(arr[i]== arr[j])
				System.out.println(arr[i]);
		}
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		for(int i=0 , j =i+1 ; i< arr.length && j<arr.length ;i++,j++) {
			if(arr[i]==arr[j]) {
				int temp= arr[i];
				arr[i]= arr[j];
				arr[i]=temp;
			}
		}
		
		System.out.println("second smallest element: "+arr[1]);
		
		System.out.println("second largest element: "+arr[arr.length-2]);
	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int n=2;	
		// n=2 means 2 times left
		for(int i=0;i<n;i++) {    // 2 times left shift
			
			int j,first;
			first = arr[0];
			
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			
			arr[j]=first;
		}
		
		System.out.println();
		
		System.out.println("array after left rotation: ");
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
	}

	void removeElementInArray(int[] arr) {
		// write code here!
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter element to be deleted: ");
		
		int ele = in.nextInt();
		
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]==ele) {
				for(int j=i;j<arr.length-1;j++)
					arr[j]=arr[j+1];
			break;
			}
		}
		
		System.out.println("array element after deletion: ");
		
		for(int i=0;i<arr.length;i++)
			System.out.println(" "+arr[i]);
		
	}

}
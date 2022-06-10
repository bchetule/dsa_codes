package Searching;

// Code not completed

public class deleteInUnsorted {

	static int delete(int[] arr, int n, int index) {
		int temp, x;
		temp = arr[index];
		for(int i=index+1; i<n; i++) {
			arr[index] = arr[i];
			index++;
		}
		return (n-1);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 50, 30, 40, 20};
		int x=50, n = arr.length, index;
		
		System.out.print("Array before deletion: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				index = i;
				n = delete(arr, n, index);
				System.out.print("Array After deletion: ");
				for(int j=0; j<n; j++) {
					System.out.print(arr[j] + " ");
				}
			}
			else {
				index = -1;
				System.out.print("Elements not present");
			}
		}
		
	}
}
		
		




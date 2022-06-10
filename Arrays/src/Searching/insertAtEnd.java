package Searching;

public class insertAtEnd {

	static int insert(int[] arr, int n, int x, int capacity) {
		if(n>=capacity) {
			return n;
		}
		arr[n] = x;
		return (n+1);
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		int n = 6, capacity = 20, key = 26;
		
		System.out.print("Before Insertion: " );
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		n = insert(arr, n, key, capacity);
		System.out.print("After Insertion: " );
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

// Time Complexity O(1)
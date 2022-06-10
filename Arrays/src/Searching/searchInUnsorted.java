package Searching;

public class searchInUnsorted {
	
	static int search(int arr[], int n, int x) {
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				return i;
			}
			else {
				continue;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = {56, 21, 90, 66, 32, 75, 29};
		int n = arr.length, x = 29;
		
		int result = search(arr, n, x);
		if(result == -1)
			System.out.print("Element not present");
		else
			System.out.print("Element present at index " + (result+1));
		
	}
}

// Time Complexity = O(n)

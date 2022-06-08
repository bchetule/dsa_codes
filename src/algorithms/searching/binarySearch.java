import java.util.*;
import java.lang.*;

public class binarySearch {
	
	public static void search(int[] arr, int x, int l, int h) {
		
		int mid = (h+l)/2;
		if(arr  [mid]==x) {
			System.out.println("The given integer is present in the array: " + " x" );
		}
		if(arr[mid]>x) {
			h = mid -1;
			search(arr, x, l, h);
		}
		if(arr[mid]<x) {
			l = mid + 1;
			search(arr, x, l, h);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {35, 89, 65, 32, 10, 20, 77, 23, 99};
		Arrays.sort(arr);
		
		int l=0, h=arr.length-1;
		int n = arr.length;
		
		
		int x = 20;
		search(arr,x, 0, n-1);
	}
}
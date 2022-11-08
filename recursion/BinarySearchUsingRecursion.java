package recursion;

public class BinarySearchUsingRecursion {
	
	
	public static void main(String[] args) {
	
	
	}
	
	public static int binarySearch(int arr[], int l, int r, int x) {
		
		int mid = l + r / 2;
		
		
		if (l >= r) {
			return -1;
		}
		
		if (arr[mid] == x) {
			return mid;
		}
		
		if (x > arr[mid]) {
			
			return binarySearch(arr, l, mid - 1, x);
		}
		{
			return binarySearch(arr, mid + 1, r, x);
		}
	}
}

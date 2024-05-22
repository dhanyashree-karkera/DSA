package Programs;

public class BinarySearch {
	static int binarySearch(int[] arr,int key) {
		int high=arr.length-1;
		int low=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				low=arr[mid]+1;
			}
			else {
				high=arr[mid]-1;
				
			}
			return -1;
			
		}
	}

public static void main(String[] args) {
	int a[]= {10,20,70,150,160,180,190};
	int key=180;
	int ans=binarySearch(a,key);
	if(ans==-1) {
		System.out.println("Key not found !");
	}
	else {
		System.out.println("Key Found at index position"+ans);
	}
}
}
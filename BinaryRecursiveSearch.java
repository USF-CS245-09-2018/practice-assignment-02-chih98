import java.util.Arrays;
public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName() {
		return "Binary Recursive";
	}
	
	public int search(int [] arr, int target) {

		int start = 0;
		int end = arr.length;

		int middle = arr.length / 2;
		
		if(end < start){
			 return -1;
		} 
		
		if (target < arr[middle]){

			int [] newArr = Arrays.copyOfRange(arr, 0, (arr.length / 2) + 1);

			return search(newArr, target);
		}
		
		if (target > arr[middle]){
			
			int [] newArr = Arrays.copyOfRange(arr, (arr.length / 2),( arr.length - 1));

			return search(newArr, target);		
		}
		
		if (target == arr[middle]){
			return middle;
		}
		
		return -1;


	}

}
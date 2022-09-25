import java.util.Arrays;

public class Solution {
	public boolean hammingWeight(int[] arr) {
		Arrays.sort(arr);
		
		boolean flag = false;
		for(int i=0; i<arr.length - 2;i++) {
			if(arr[i] - arr[i+1] == arr[i+1] - arr[i+2]) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		if(arr.length == 2 || flag == true) {
			return true;
		}else {
			return false;	
		}
			
	}
}

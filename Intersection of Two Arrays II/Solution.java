
import java.util.*;

public class Solution {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		if(nums1 == null || nums2 == null) return null;
		
		Map<Integer,Integer> result = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < nums1.length ; i++){
			for(int j = 0 ; j < nums2.length ; j++){
				
				if(result.containsKey(j)) continue;
				
				int iv = nums1[i];
				int jv = nums2[j];
				
				if(iv == jv){
					
					result.put(j,jv);
					break;
				}
			}
		}

		//Convert
		
		Object set[] = result.entrySet().toArray();
		
		int value[] = new int[set.length];
		
		for(int i = 0 ; i < set.length ; i++){
			String v = String.valueOf(set[i]);
			value[i] = Integer.parseInt(v.split("=")[1]);
		}

		return value;
	}


	public static void main(String args[]){
		int nums1[] = {1,2,2,4,3,41,1};
		int nums2[] = {2,2,4};
		int result[] = intersect(nums1,nums2);
		System.out.println(Arrays.toString(result));
	}	
}
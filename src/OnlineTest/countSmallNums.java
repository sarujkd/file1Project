package OnlineTest;

public class countSmallNums {

	static int countSmallerToTheRight(int[] nums){
		
            int count=0;
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j] < nums[i])
                count++;
				
			}
			
		}

		return count;
	}
	
	public static void main(String[] args) {
		
		int nums[]= {3,8,4,1,0};
		
		System.out.println("counting Smaller numbers To The Right : "+countSmallerToTheRight(nums));
			}

}

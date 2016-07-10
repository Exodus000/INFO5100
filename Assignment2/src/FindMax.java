//- Write a method to find the maximum number in an array of numbers
//	Example :
//		Input : [3, 5, 7, 1, 4, 32, 15]
//		Output : 32

public class FindMax {
	public int findmax(int[] nums){
		int max = nums[0];
		for(int i = 0 ;i<nums.length ; i++){
			if (nums[i]>max){
			max = nums[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
			FindMax f= new FindMax();
			int[] nums = {1, 22, 43, 52, 6};
			f.findmax(nums);
			System.out.println(f.findmax(nums));
	}

}

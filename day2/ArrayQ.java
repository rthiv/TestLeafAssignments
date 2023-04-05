package week1.day2;

public class ArrayQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int[] nums = {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==5) {
				count = count +1;
			}
		}
		System.out.println(count);
	}

}

package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		
		double[] nums2 = {10.1,10.2,10.3,10.4,10.5};
		
		boolean[] truth = {true,false,true,false,true};
		
		String[] str = {"1","2","3","4","5"};
		
		int[] result=nums.clone();//배열객체 복사본 얻어내기
		int[] result2=nums;
		
		int size=nums.length;
		
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		
		
		
		System.out.println(nums2[3]);
		
	}
}

public class missing_Number {

        static int missingNumber(int[] nums) {
//            for 0 to n: =[0,1,2,3,4,5,6]
            int n=nums.length;
            int sum=n*(n+1)/2;
            int current=0;
            for(int i=0;i<nums.length;i++){
                current+=nums[i];
            }
            int missing=sum-current;
            return missing;
    }

    static int MISSING(int[] nums){
//            for 1 to n
            int n=nums.length+1;
            int Actual_sum=n*(n+1)/2;
            int sum=0;
            for (int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            return Actual_sum-sum;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,3,5};
        int[] arr2={1,2,3,4,5,7};
        int output=missingNumber(arr);
        int output2=MISSING(arr2);
        System.out.println("missing element is " + output);
        System.out.println("missing element from 1 to n : " + output2);
    }
}

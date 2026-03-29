import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for( int j=i+1;j<nums.length;j++)
            {
               if(nums[i]+nums[j]==target)
               {
                arr[0]=i;
                arr[1]=j;
                break;
               }
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.printf("Enter %d elements:\n", n);
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.printf("Enter target: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        System.out.printf("Output indices: %s\n", Arrays.toString(result));
    }
}
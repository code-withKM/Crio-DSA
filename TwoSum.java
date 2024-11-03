import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm  = new HashMap<>();

        for(int j=0;j<nums.length-1;j++){
            int x= target-nums[j];

         
            if(hm.containsKey(x)){
                int i = hm.get(x);
                return new int[] {i,j};
            }
            hm.put(nums[j], j);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        int[] complements = new TwoSum().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}
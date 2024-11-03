import java.util.*;

class ThreeSum {
    
    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int j=0;j<nums.length;j++){
            for(int k=0;k<nums.length-1;k++){
                int x = 0-nums[j]-nums[k];
                if(hm.containsKey(x)){
                    int i = hm.get(x);
                   
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    
             
                }
                hm.put(nums[j], j);
                hm.put(nums[k], k);
            }
           
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer nums[] = new Integer[n];
        for(Integer i = 0 ; i < n ;i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d %d %d\n", result.get(i).get(0), result.get(i).get(1), result.get(i).get(2));
        }
    }
};
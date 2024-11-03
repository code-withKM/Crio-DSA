import java.util.*;

class ThreeSum {
    
    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            if(i-1>=0 && nums[i]== nums[i-1]){
                continue;
            }
            int l=i+1;
            int r= nums.length-1;

            while(l<r){

                if(l-1>i && nums[l]==nums[l-1]){
                    l++;
                    continue;
                    
                }
                int sum = nums[i]+nums[l]+nums[r];

                if(sum==0){
                    List<Integer>tr= new ArrayList<>();
                    tr.add(nums[i]);
                    tr.add(nums[l]);
                    tr.add(nums[r]);
                    result.add(tr);
                    l++;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
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
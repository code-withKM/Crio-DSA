
class ContainerWithMostWater {

    // Complete the function implementation below
    public int maxArea(int[] height) {
        int answer = 0;

        // for (int i = 0; i < height.length; i++) { //o(n2)
        //     for(int j=i+1;j<height.length;j++){
        //         int small = Math.min(height[i], height[j]);
        //         int dis = j-i;
        //         int area = small*dis;
        //         if(area>answer){
        //             answer = area;
        //         }
        //     }
        // }

            int l=0;
            int r= height.length-1;
            while(l<r){
                int small = Math.min(height[l], height[r]);
                int dis = r-l;
                int area = small*dis;
                if(area>answer){
                    answer = area;
                }
               if(height[l]<height[r]){
                l++;
               }
               else{
                r--;
               }
            }
     

        return answer;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int height[] = new int[n];
        // for(int i = 0 ; i < n ; i++) {
        //     height[i] = scanner.nextInt();
        // }
        // scanner.close();
        int height[] = {1,8,6,2,5,4,8,3,7};
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println("the answer is "+" "+result);
    }
}
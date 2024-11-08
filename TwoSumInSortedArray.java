import java.util.*;

class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {
        int l= 0;
        int r = n-1;

        while(l<r){
            if(arr[l]+arr[r]==k){
                return true;
            }
            else if(arr[l]+arr[r]>k){
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}
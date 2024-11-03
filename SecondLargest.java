public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {12, 35, 1, 10, 34, 1};
        int n= a.length;

        int l = a[0];
        int s = 0;
        // int s = a[1];
        for (int i = 1; i < n; i++) {
            if(a[i]>l){
                s=l;
                l=a[i];
                 
            }else if(a[i]> s && a[i]!=l){
                s=a[i];
            }
            
              
            
        }
        System.out.println("largest element is"+ " "+l);
        System.out.println("second largest element is"+ " "+s);
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        int a[] ={1,8,6,2,5,4,8,3,7};
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

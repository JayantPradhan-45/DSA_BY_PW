package BasicSorting;
public class BubbleSort02 {
    public static void print(int[] a){
        for(int ele:a){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a ={5,2,3,1,4};
        int n=a.length;
        print(a);  //better approach as compare to bubble sort 1
        for(int x=0;x<n-1;x++){
            boolean flag=true;
            for(int i=0;i<n-1-x;i++){
                if(a[i] > a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;

        }
        print(a);
    }
}

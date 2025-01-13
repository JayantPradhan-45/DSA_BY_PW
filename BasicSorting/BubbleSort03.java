//sort a given array in decreasing order using bubble sort
package BasicSorting;

public class BubbleSort03 {
    public static  void print(int[] a){
        for(int ele:a){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a={3,1,2,5,4};
        int n=a.length;
        print(a);
        for(int x=0;x<n-2;x++){
            boolean flag=true;
            for(int i=0;i<n-1-x;i++){
                if(a[i] < a[i+1]){
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

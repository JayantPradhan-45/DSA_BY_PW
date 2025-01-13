package BasicSorting;
public class BubbleSort01 {
    public static void print(int[] a){
        for(int ele:a){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a={3,1,2,5,4};
        int n=a.length;
        print(a);
        for(int x=1;x<=n-1;x++){   // number of passes 
            for(int i=0;i<n-1;i++){    // wrost case approach
                if(a[i] > a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }

        print(a);
    }
}

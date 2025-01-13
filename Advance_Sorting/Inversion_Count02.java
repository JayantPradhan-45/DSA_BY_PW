package Advance_Sorting;
//method number two
public class Inversion_Count02 {
    static int count; //global variable
    public static void Print(int[] arr){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void Inversion(int[] a, int[] b){
        int i=0 ,j=0;
        while(i<a.length && j< b.length){
            if(a[i]>b[j]){
                count +=(a.length-i);
                j++;
            }
            else{
                 i++;
            }
        }

    }
    public static void merge(int[] a,int[] b ,int[] c){
        int i=0 ,j=0 ,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                c[k++]=a[i++];
            }
            else{ //a[i] > b[j]
                count +=(a.length-i);
                c[k++]=b[j++];
            }
        }
        if(i==a.length){
            while(j<b.length) c[k++]=b[j++];

        }
        if(j==b.length){
            while(i<a.length) c[k++]=a[i++];
        }
    }
    public static void MergeSort(int[] arr){
        int n=arr.length;
        //base case
        if(n==1) return ;
        //create two array a and b of n/2 each
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //copy pasting
        for(int i=0;i<n/2;i++)  a[i]=arr[i];
        for(int i=0;i<n/2;i++)  b[i]=arr[i+n/2];
        //magic
        MergeSort(a);
        MergeSort(b);
        //count for inversion
//        Inversion(a,b);
        //merge this a and b
        merge(a,b,arr);
    }
    public static void main(String[] args){
        int[] arr={8,2,5,3,1,4};
        Print(arr);
        MergeSort(arr);
        Print(arr);
        System.out.println(count);
    }
}

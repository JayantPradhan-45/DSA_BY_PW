package Advance_Sorting;

public class Inversion_Count {
    public static int count;
    public static void Print(int[] arr){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void Inversion(int[] a,int[] b){
        int i=0 ,j=0;
        while(i<a.length && j<b.length){
            if(a[i] > b[j]){
                count += (a.length-i);
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
            else {
                c[k++]=b[j++];
            }
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
    public static void mergesort(int[] arr){
        int n=arr.length;
        //base case
        if(n==1) return ;
        //create two array of n/2 size each
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //copy pasting
        for(int i=0;i<n/2;i++)  a[i]=arr[i];
        for(int i=0;i<n-n/2;i++)  b[i]=arr[i+n/2];
        //magic
        mergesort(a);
        mergesort(b);
        Inversion(a,b);
        //merge this a and b
        merge(a,b,arr);
    }
    public static void main(String[] args){
        int[] arr={8,2,5,3,1,4};
        Print(arr);
        mergesort(arr);
        Print(arr);
        System.out.println(count);
    }
}

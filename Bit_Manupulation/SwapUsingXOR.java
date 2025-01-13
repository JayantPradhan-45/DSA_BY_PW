package Bit_Manupulation;

public class SwapUsingXOR {
    public static void main(String[] args){
        int a=2 ,b=5;
        System.out.println(a + " " + b);
//        System.out.println(a + " " + b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a + " " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " " + b);

        System.out.println();
          //using bit manupulation method
//        System.out.println(a + " " + b);
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a+ " " +b);
    }
}

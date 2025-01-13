package OopsINJava;

public class SimplifyFraction {
    public static int gcd(int num, int den){
        int min=Math.min(num, den);
        for(int i=min;i>=1;i--){
            if(num % i ==0 && den % i ==0){
                return i;
            }
        }
        return num;
    }
    public static class Fraction{
        int num;
        int den;
        //make constructor
        public Fraction(int num,int den){
            this.num=num;
            this.den=den;

        }
        public void Simplify(){
            int HCF=gcd(num,den);
            num =num/HCF;
            den=den/HCF;
        }
    }

    public static void main(String[] args) {
        Fraction f1=new Fraction(7,35);
        System.out.println(f1.num + " / " + f1.den);
        f1.Simplify();
        System.out.println(f1.num + " / " + f1.den);
        Fraction f2=new Fraction(7,3);


    }

}

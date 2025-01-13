package BackTracking;
public class PrintPermutations {
    public static void Printp(String str , String E){
        if(str.equals("")){
            System.out.println(E);
            return;
        }
        for(int i=0;i<str.length() ;i++){
            char ch=str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem =left +right;
            //work recursively
            Printp(rem, E + ch);
        }
    }
    public static void main(String[] args){
        String str ="abc";
        Printp(str,"");  // string and empty string
    }
}

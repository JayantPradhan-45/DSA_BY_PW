//Reverse each word in a given sentence (ex:i am raghav garg --> i ma vahgar grag )
package Strings;
public class ReverseEachWordInSentence {
    public static void Reverse(StringBuilder s,int i,int j){
        while(i<=j){
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        StringBuilder s=new StringBuilder(" Hye i am jayant pradhan  ");
        int i=0 ,j=0;
        while(j<s.length()){
            if(s.charAt(j) !=' ') j++;
            else if (s.charAt(j) == ' '){
                Reverse(s,i,j-1);
                i=j+1;
                j=i;
            }
        }
        Reverse(s,i,j-1); //for last word reverse
        System.out.println(s)   ;
    }
}

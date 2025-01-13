//tables of 19
package Basic_questions;
public class TablesOf19 {
    public static void main(String[] args){
//        for(int i=19 ;i<=190;i++){  //171 rounds
//            if(i%19==0){
//                System.out.println(i);
//            }
//        }
        //good approach
        for(int i=19;i<=190;i+=19){ // 10 rounds
            System.out.println(i);
        }
    }
}

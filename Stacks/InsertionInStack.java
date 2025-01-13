package Stacks;
// insert any number in any index
import java.util.Stack;
public class InsertionInStack {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(9000);
        st.push(30);
        st.push(40);
        int idx=2;
        int n=33;
        Stack<Integer> gt=new Stack<>();
        while(st.size() > idx){
            gt.push(st.pop());
        }
        while(gt.size() >idx ){
            gt.push(st.pop());

        }
        st.push(n);
        System.out.println(st);
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println(st);


    }
}

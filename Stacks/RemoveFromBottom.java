package Stacks;
import java.util.Stack;
public class RemoveFromBottom {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(23);
        st.push(45);
        st.push(34);
        st.push(22);
        Stack<Integer> gt=new Stack<>();

        while(st.size() > 1){
            gt.push(st.pop());

        }
        st.pop();
        while(gt.size() >0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }

}

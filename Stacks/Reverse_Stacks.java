package Stacks;
import java.util.Stack;
public class Reverse_Stacks {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());

        }
        System.out.println(gt);
        Stack<Integer> rt=new Stack<>();
        while(gt.size() > 0 ){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        while(rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}

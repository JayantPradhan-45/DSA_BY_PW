package Stacks;
import java.util.*;
public class ArrayImplementation {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full you can't add anything right now ");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(int x){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else{
                return false;
            }
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(20);
        st.push(11);
        st.push(111);
        st.display();
        System.out.println(st.isFull());
        st.push(200);
        st.capacity();

    }
}
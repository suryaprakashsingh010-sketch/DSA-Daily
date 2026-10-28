import  java.util.*;

public class stack {
    public static  void main(String[] args){
        Stack<Integer> st  = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(80);
        System.out.print(st);
        st.pop();
        System.out.println();
        System.out.print(st);
        System.out.println();
        System.out.print(st.peek());
        System.out.println();
        System.out.print(st.size());
        System.out.println();
        System.out.print(st.isEmpty());
    }
}

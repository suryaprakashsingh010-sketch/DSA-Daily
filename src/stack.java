import  java.util.*;
//
//public class stack {
//    public static  void main(String[] args){
//        Stack<Integer> st  = new Stack<>();
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(80);
//        System.out.print(st);
//        st.pop();
//        System.out.println();
//        System.out.print(st);
//        System.out.println();
//        System.out.print(st.peek());
//        System.out.println();
//        System.out.print(st.size());
//        System.out.println();
//        System.out.print(st.isEmpty());
//    }
//}


//import java.util.Stack;
//
//public class stack {
//    public static void main(String []args){
//        Stack<Integer> st = new Stack<>();
//        Scanner cs = new Scanner(System.in);
//        System.out.print("Enter your number");
//        int n = cs.nextInt();
//        for (int i=0; i<n; i++){
//            int x = cs.nextInt();
//            st.push(x);
//        }
//        System.out.print(st);
//    }
//}
//import java .util.*;
//public class stack {
//    public  static void main(String []args){
//        Stack<Integer> st  =new Stack<>();
//        st.add(20);
//        st.add(30);
//        st.add(40);
//        st.add(60);
//        st.add(60);
//
//        Stack<Integer> st1 = new Stack<>();
//        st1.addAll(st);
//
//        System.out.print(st);
//        System.out.println();
//        System.out.print(st1);
//    }
//}



//import java.util.*;
//
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        Scanner cs = new Scanner(System.in);
//
//        System.out.print("Enter number of elements: ");
//        int n = cs.nextInt();
//
//        System.out.println("Enter stack elements:");
//        for (int i = 0; i < n; i++) {
//            st.push(cs.nextInt());
//        }
//
//        System.out.print("Enter index: ");
//        int inx = cs.nextInt();
//
//        System.out.print("Enter number to insert: ");
//        int x = cs.nextInt();
//
//        if (inx < 0 || inx > st.size()) {
//            System.out.println("Invalid index");
//            cs.close();
//            return;
//        }
//
//        Stack<Integer> temp = new Stack<>();
//
//        while (st.size() > inx) {
//            temp.push(st.pop());
//        }
//
//        st.push(x);
//
//        while (!temp.isEmpty()) {
//            st.push(temp.pop());
//        }
//
//        System.out.println("Updated Stack: " + st);
//
//        cs.close();
//    }
//}


//display Stack using array
import java.util.*;
public class stack {
    public static void main(String [] arge){
        Stack<Integer> st =new Stack<>();
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);

        int [] arr = new int[3];
        for (int i = 0; i<3;i++){
            arr[i] =st.pop();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.println();
        }
    }
}
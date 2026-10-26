//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
////        System.out.println("Hello Surya");
////        HashMap<Integer, String> map = new HashMap<>();
////        map.put(101,"Surya");
////        map.put(102, "Aman");
////        map.put(103, "Riya");
////        System.out.print(map);
//
////        HashMap<String , Integer> map = new HashMap<>();
////        map.put("java", 90);
////        map.put("python", 85);
////        map.put("C++" , 80);
////        System.out.print(map.get("java"));
////        System.out.println();
////        System.out.print(map.get("python"));
////        System.out.println();
////        System.out.print(map.get("C++"));
//
////        System.out.println();
//////        Q.3
////        System.out.print(map.containsKey("java"));
////        Q.4
////        HashMap<String , Integer> map = new HashMap<>();
////        map.put("Apple" , 50);
////        map.put("Mango" , 80);
////        map.put("Banana", 30);
////        map.put("Apple" , 60);
////        map.remove("Banana");
////
////        System.out.print(map.size());
//
//        HashMap<Integer , Integer>map = new HashMap<>();
//
//        int[] arr = {2,3,2,4,3,2};
//        for(int i = 0; i<arr.length; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//            }else{
//                map.put(arr[i], 1);
//            }
//        }
//        System.out.print(map);
//
//    }
//}


//import java.util.*;
//public class Main {
//    public static void main(String[] arge){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int [] arr = {2,3,2,4,3,2};
//
//        for(int  i =0; i<arr.length; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i] , map.get(arr[i])+1);
//
//            }else{
//                map.put(arr[i] , 1);
//            }
//        }
//        System.out.print(map);
//    }
//}


//import java.util.*;
//public class Main {
//    public static void main(String[] arge){
//      HashMap<Integer , Integer> map = new HashMap<>();
//      int [] arr = {4, 2,7,2,4};
//      for (int  i =0; i<arr.length; i++){
//          if(map.containsKey(arr[i])){
//              System.out.print(arr[i]);
//              break;
//          }else{
//              map.put(arr[i], 1);
//          }
//      }
//    }
//}


//import java.util.*;
//public class Main {
//    public static void main(String[] arge){
//      HashMap<Integer , Integer> map = new HashMap<>();
//      int [] arr = {1,3,3,4,2,3,2};
//       for(int  i =0; i<arr.length; i++){
//           if(map.containsKey(arr[i])){
//               map.put(arr[i] , map.get(arr[i])+1);
//           }else{
//               map.put(arr[i], 1);
//           }
//       }
//
//     int maxfre =0;
//       int ans = -1;
//       for(int key: map.keySet()){
//           if(map.get(key) >maxfre){
//               maxfre = map.get(key);
//               ans = key;
//           }
//       }
//
//       System.out.print(ans);
//    }
//}



//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//        HashSet<Integer> st = new HashSet<>();
//        st.add(1);
//        st.add(2);
//        st.add(3);
//        st.add(1);
//        st.add(4);
//        System.out.print(st);
//    }
//}


//Q.2
//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//      HashSet<Integer> st = new HashSet<>();
//      st.add(10);
//      st.add(20);
//      st.add(30);
//      st.add(40);
//      System.out.print(st.contains(30));
//      System.out.println();
//      System.out.print(st.size());
//
//    }
//}


import java.util.*;
public class Main {
    public static void main(String[] args){
        HashSet<Integer> st = new HashSet<>();
        if(st.contains(1))
        st.add(3);
        st.add(7);
        st.add(9);
        st.add(4);


    }
}
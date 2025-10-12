// public class Recur {
//         static int a=0;
//     static void again(){
        
//         if(a<=10){
//             a++;
//             System.out.println("prints again");
//             a++;
//             again();
//         }
//     }
//     public static void main(String[] a){
//         again();
//     }
// }

//direct recursion
// public class Recur{
//     static void msg(int a){
//         if(a==0)
//             return;
//         System.out.println(a);
//         msg(a-1);

//     }
//     public static void main(String[] a){
//         msg(7);
//     }
// }

//indirect recursion

// public class Recur{

//     static void first(int a){
//         if (a<=0) return;
//         System.out.println("First: "+a);
//         second(a-1);
//     }

//     static void second(int a){
//         if (a<=0) return;
//         System.out.println("Second: "+a);
//         first(a/2);
//     }
//     public static void main(String[] a){
//         first(11);
//     }
// }


// public class Recur{
//     static void Tail(int a){
//         if (a==0) return;
//         System.out.println(a);
//         Tail(a-1);
//     }
//     static void Head(int a){
//         if (a==0) return;
//         Head(a-1);
//         System.out.println(a);
//     }
//     public static void main(String[] a){
//         Tail(5);
//         System.out.println();
//         Head(5);

//     }
// }

public class Recur{

    static int fib(int n){
        if (n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] a){
        System.out.println(fib(10));  // 0 + 1 + 1 + 2+ 3+ 5+ 8+ 13+ 21+ 34+ 55

    }
}
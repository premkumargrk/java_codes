import java.util.*;
public class Wrap {
    public static void main(String[] args) {
        
//         // --- BOXING ---
//         // Converting primitive type to Wrapper object
//         int a = 10;  //stored in stack 
//         Integer boxedA = Integer.valueOf(a); // stored in heap memory // Manual Boxing
//         Integer autoBoxedA = a;             // Autoboxing (automatic conversion)
        
//         System.out.println("Primitive value: " + a);
//         System.out.println("Boxed using valueOf(): " + boxedA); // Java automatically calls boxedA.toString() internally,which returns "10".
//         System.out.println("Boxed using valueOf(): " + boxedA); 
//         System.out.println("Autoboxed value: " + autoBoxedA);
        
        
//         // --- UNBOXING ---
//         // Converting Wrapper object back to primitive type
//         Integer numObj = 20;
//         int num1 = numObj.intValue();   // Manual Unboxing
//         int num2 = numObj;              // Auto-unboxing (automatic conversion)
        
//         System.out.println("Wrapper object: " + numObj);
//         System.out.println("Unboxed using intValue(): " + num1);
//         System.out.println("Auto-unboxed value: " + num2);


        // String str1 = "123";
        // String str2 = "45.67";
        // String str3 = "true";

        // int num = Integer.parseInt(str1);
        // double d = Double.parseDouble(str2);
        // boolean flag = Boolean.parseBoolean(str3);

        // System.out.println("Integer: " + num);
        // System.out.println("Double: " + d);
        // System.out.println("Boolean: " + flag);

        // String str="594";
        // Integer i=Integer.valueOf(str);
        // System.out.println("int: "+i);

        ArrayList<Integer> num=new ArrayList <>();
        num.add(10);
        num.add(23);
        num.add(90);
        for(int a:num){
            System.out.println("values: "+a);
        }
    }
}



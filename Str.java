public class Str {
    public static void main(String[] strargs){
        String str="statement";
        String str2=" is ended";
        String one="EQuals";
        String two="equals\n";
        System.out.println(str.length());
        System.out.println(str.charAt(8));
        System.out.println(str.concat(str2));
        System.out.println(one.equals(two));
        System.out.println(one.equalsIgnoreCase(two));
        System.out.println(one.toUpperCase());
        System.out.println(one.toLowerCase());    //0,1,2,3...n   // n-1
        System.out.println(str.substring(0, 4));
        System.out.println(str2.contains("is e"));
        System.out.println(str2.startsWith(" is"));
        System.out.println(two.endsWith("ls\n"));
        System.out.println(str2.indexOf('s'));
        System.out.println(str2.replace('d','s'));
        String trim_str="   ignorance_of_spaces  ";
        System.out.println(trim_str);
        System.out.println(trim_str.trim());

        String collections="sony_camera-fujifilm-kodak-cannon";
        String[] arr=collections.split("-");
        for(String i:arr){
            System.out.println(i);
        }
        System.out.println("30"+"10");
        
        Object b='C';
        System.out.println(b.getClass().getName());   
        String char_str=String.valueOf(b);
        System.out.println("the string value: "+char_str);   
        Object obj=char_str;
        System.out.println(obj.getClass().getName());  
        System.out.println(b instanceof Character);
        
        // char a='B';
        // double pi=3.145950405;
        // System.out.println(pi);
        // System.out.println("the char value is: "+a.getClass().getName());
        // String double_str=String.valueOf(pi);
        // System.out.println("the double value is: "+double_str);
        // String mychar=String.valueOf(a);
        // System.out.println("the string value is: "+mychar);
    }
}

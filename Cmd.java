public class Cmd {
    public static void main(String[] name) {
        System.out.println("Number of arguments: " + name.length);
        System.out.println("argument: "+name[0]);
        System.out.println("argument: "+name[1]);
        // System.out.println("argument: "+name[2]);

        for (int i = 0; i < name.length; i++) {
            System.out.println("Argument " + i + ": " + name[i]);
        }
    }
    
}

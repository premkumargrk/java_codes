public class Cmd {
    public static void main(String[] a) {
        System.out.println("Number of arguments: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Argument " + i + ": " + a[i]);
        }
    }
}

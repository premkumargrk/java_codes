// import java.util.regex.*;

// public class Example2 {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[^abc]");
//         Matcher m = p.matcher("abc123xyz");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[^abc]");
//         Matcher m = p.matcher("abc123xyz");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[a-zA-Z]");
//         Matcher m = p.matcher("Python 3.9 is Awesome!");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[a-d[m-p]]"); // Union of a–d and m–p
//         Matcher m = p.matcher("alphabent mop qrst");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet{
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[a-z&&[def]]");
//         Matcher m = p.matcher("abcdefgxyz");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[a-z&&[^bc]]"); // removes b and c
//         Matcher m = p.matcher("abcdefxyz");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

// import java.util.regex.*;

// public class Alphabet {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile("[a-z&&[^m-p]]"); // removes m to p
//         Matcher m = p.matcher("abcdefghijklmnoqrstuvxyz");
//         while (m.find()) {
//             System.out.println("Matched: " + m.group());
//         }
//     }
// }

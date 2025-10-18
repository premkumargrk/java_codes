import java.util.regex.*;
// public class Search {
//     public static void main(String[] args){
//         // String test="Email : users@gmail.com";
//         // Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
//         // Matcher match=pattern.matcher(test);
//         // if(match.find()){
//         //     System.out.println("email found: "+match.group());
//         // } else{
//         //     System.out.println("no email is founded");
//         // }

//         String input = "a aa aaa aaaa aaaaa";

//         Pattern pattern1=Pattern.compile("a{2,4}");
//         Matcher match= pattern1.matcher(input);
//         System.out.println("mathches for a: ");
//         // if(match.find()){
//         //     System.out.println("found: "+match.group());
//         // }
//         int count=0;
//         while(match.find()){
//             System.out.println("found: "+match.group());
//             count++;
//         }
//         System.out.println("the count variable: "+count);
//     }    
// }

public class Search{
    public static void main(String[] a){
        String values="Order ID_:_685";
        Pattern pattern = Pattern.compile("\\s+");
        Matcher match= pattern.matcher(values);
        if(match.find()){
            MatchResult result= match.toMatchResult();
            System.out.println("match_text: "+result.group());
            System.out.println("Start: "+result.start());
            System.out.println("Stop: "+result.end());
        }
    }
}
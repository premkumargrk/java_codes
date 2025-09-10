import java.util.*;
class Practice{
    static int a=150;
    static String b="this";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the input_2(50 0r 100): ");
        int input_2=sc.nextInt();
        switch(a+input_2){
            case 200:
            System.out.print("this is 200\n");
            break;

        
            case 250:
            switch(a+input_2){
                case 250:
                System.out.print("this is 250\n");
                break;
                default:
                System.out.println("this is default inner switch-case");
            }
            default:
            System.out.print("this is outside switch-case");
            break;
        }
        System.out.print("enter one value from 1 to 3: ");
        String word = sc.next();
        switch(word){
            case "one" -> System.out.print("the value is one"); 
                        case "two" -> System.out.print("the value is one"); 
                                    case "three" -> System.out.print("the value is two"); 
                                    default -> System.out.print("IT is invalid");

        }
        sc.close();
        System.out.printf("the actual of a is %d and input_2 is %d",a,input_2);
    }
}
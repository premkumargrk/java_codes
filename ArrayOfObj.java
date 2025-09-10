// import java.util.*;
// class School{
//     String Name;
//     int FoundationOfYear;
//     School(String Name, int FoundationOfYear){
//         this.Name=Name;
//         this.FoundationOfYear=FoundationOfYear;
//     }

//     public void display(){
//         System.out.println("Name of the school is: "+Name+" ,Founded at: "+FoundationOfYear);
//     }
// }

// public class ArrayOfObj {
//     public static void main(String a[]){
//         School input[] = new School[4];
//         Scanner sc=new Scanner(System.in);
//          for (int i = 0; i < input.length; i++) {
//             System.out.print("Enter name for school " + (i+1) + ": ");
//             String name = sc.nextLine();
//             System.out.print("enter the foundation of the year: ");
//             int age = sc.nextInt();
//             sc.nextLine(); // consume newline

//             input[i] = new School(name, age); 
//          }
//             for(School k : input){
//                k.display();
//             }
        
//             sc.close();
//         // for(int i=0; i<input.length;i++){
//         //     input[i].display();
//         // }
    
// }}

// // import java.util.*;

// // class School {
// //     String Name;
// //     int FoundationOfYear;

// //     School(String Name, int FoundationOfYear) {
// //         this.Name = Name;
// //         this.FoundationOfYear = FoundationOfYear;
// //     }

// //     void display() {
// //         System.out.println("Name of the school is: " + Name + " , Founded at: " + FoundationOfYear);
// //     }
// // }

// // public class ArrayOfObj {
// //     public static void main(String a[]) {
// //         School input[] = new School[4];
// //         Scanner sc = new Scanner(System.in);

// //         // Take input for each School object
// //         for (int i = 0; i < input.length; i++) {
// //             System.out.print("Enter name for school " + (i + 1) + ": ");
// //             String name = sc.nextLine();

// //             System.out.print("Enter the foundation year: ");
// //             int year = sc.nextInt();
// //             sc.nextLine(); // consume newline

// //             input[i] = new School(name, year);  // initialize object
// //         }

// //         // After input, display all schools
// //         System.out.println("\n--- School Details ---");
// //         for (School k : input) {
// //             k.display();
// //         }

// //         sc.close(); // close scanner at the END
// //     }
// // }


public class ArrayOfObj{
    public static void main(String[] a){
        int arr[]={2,3,4,5,6,7,8,9};
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(+arr[i]+" ");
        }
    }
}

import java.util.*;

class Students{
    String name;
    int ID;
    String school;
    Students(String name, int ID,String school){
        this.name=name;
        this.ID=ID;
        this.school=school;
    }

    void student_details(){
        System.out.println("name: "+name+" "+"Id: "+ID+" "+"schools: "+school);
    }
}

class Student_marks extends Students{
    int Total_marks;
    Student_marks(String name, int ID, String school, int Total_marks){
        super(name,ID, school);
        this.Total_marks=Total_marks;
    }

    public void Student_detailed_marks(){
        student_details();
        System.out.print("marks scored: "+(Total_marks/5)+"%");
       
    }

}


public class Connect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter your ID: ");
         int id=sc.nextInt();
         sc.nextLine();
        System.out.print("enter your name: ");
        String name=sc.nextLine();
        // sc.nextLine();
        System.out.print("enter your name of your school: ");
        String school=sc.nextLine();
         System.out.print("enter your total marks out of 500: ");
         int marks=sc.nextInt();
        Student_marks input= new Student_marks(name,id,school,marks);
        input.Student_detailed_marks();
        sc.close();
    }
}

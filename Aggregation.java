class Student{
    String name;
    int ID;
    Student(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
}

class Department{
    String DEPT_name;
    Student student;

    Department (String DEPT_name, Student student){
        this.DEPT_name=DEPT_name;
        this.student=student;
    }
}
public class Aggregation {
public static void main(String[] args) {
    Student s=new Student("James gosling",56);
    Department d= new Department("PHD in java",s);
    System.out.println(s.name+" "+s.ID+" "+d.DEPT_name);
}
}

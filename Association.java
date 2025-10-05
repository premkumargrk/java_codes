class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}

public class Association {

 public static void main(String[] args) {
    Teacher t=new Teacher("prem");
    Student s=new Student("kumar");
    System.out.println(t.name+" "+s.name);

 }   
}

import java.io.*;

// Class for demonstrating Object Streams
class Student implements Serializable {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class Stream {

    public static void main(String[] args) {

        try {
            // ============================
            // 1. BYTE STREAMS
            // ============================

            // Writing bytes to a file using FileOutputStream + BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("byteData.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String text = "This is Byte Stream Example";
            bos.write(text.getBytes());
            bos.close();
            fos.close();
            System.out.println("Byte Stream Writing Done.");

            // Reading bytes from a file using FileInputStream + BufferedInputStream
            FileInputStream fis = new FileInputStream("byteData.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int b;
            System.out.print("Byte Stream Reading: ");
            while ((b = bis.read()) != -1) {
                System.out.print((char) b);
            }

            bis.close();
            fis.close();


            // ============================
            // 2. CHARACTER STREAMS
            // ============================

            // Writing text using FileWriter + BufferedWriter + PrintWriter
            FileWriter fw = new FileWriter("charData.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("This is Character Stream Example.");
            pw.println("Line 2 using PrintWriter.");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("\nCharacter Stream Writing Done.");

            // Reading text using FileReader + BufferedReader
            FileReader fr = new FileReader("charData.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nCharacter Stream Reading:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();


            // ============================
            // 3. OBJECT STREAMS
            // ============================

            // Create an object to write
            Student s1 = new Student("Griot", 22, 88.5);

            // Writing object using ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData.obj"));
            oos.writeObject(s1);
            oos.close();
            System.out.println("\nObject Stream Writing Done.");

            // Reading object using ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("studentData.obj")
            );

            Student s2 = (Student) ois.readObject();
            ois.close();

            System.out.println("\nObject Stream Reading:");
            System.out.println("Name  : " + s2.name);
            System.out.println("Age   : " + s2.age);
            System.out.println("Marks : " + s2.marks);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF2 {

    private static final String FILE_NAME = "students.dat";
    private static final int RECORD_SIZE = 48; // 4 + 40 + 4

    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw");

            // 1. Write sample student records
            writeStudent(raf, 0, 101, "Rahul", 88.5f);
            writeStudent(raf, 1, 102, "Anita", 92.0f);
            writeStudent(raf, 2, 103, "Vijay", 75.5f);

            System.out.println("✔ Records written.\n");

            // 2. Read second student (index 1)
            System.out.println("Reading Student at Index 1:");
            readStudent(raf, 1);

            // 3. Update marks of student at index 2
            System.out.println("\nUpdating marks of Student at Index 2:");
            updateMarks(raf, 2, 85.0f);

            // 4. Read updated student record
            readStudent(raf, 2);

            raf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write Student Record (position-based)
    private static void writeStudent(RandomAccessFile raf, int index,
                                     int roll, String name, float marks) throws IOException {

        raf.seek(index * RECORD_SIZE); // Jump to record position

        raf.writeInt(roll);                 // 4 bytes
        writeFixedString(raf, name, 20);    // 40 bytes (20 chars)
        raf.writeFloat(marks);              // 4 bytes
    }

    // Read Student Record
    private static void readStudent(RandomAccessFile raf, int index) throws IOException {

        raf.seek(index * RECORD_SIZE);

        int roll = raf.readInt();
        String name = readFixedString(raf, 20);
        float marks = raf.readFloat();

        System.out.println("Roll No: " + roll);
        System.out.println("Name    : " + name.trim());
        System.out.println("Marks   : " + marks);
    }

    // Update only marks
    private static void updateMarks(RandomAccessFile raf, int index, float newMarks) throws IOException {

        long marksPos = (index * RECORD_SIZE) + 44; // 4 + 40 bytes
        raf.seek(marksPos);
        raf.writeFloat(newMarks);

        System.out.println("✔ Marks Updated Successfully.");
    }

    // Write fixed-length string (20 chars)
    private static void writeFixedString(RandomAccessFile raf, String str, int length) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        sb.setLength(length); // ensure 20 chars
        raf.writeChars(sb.toString());
    }

    // Read fixed-length string
    private static String readFixedString(RandomAccessFile raf, int length) throws IOException {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(raf.readChar());
        }
        return sb.toString();
    }
}

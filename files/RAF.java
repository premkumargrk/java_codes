import java.io.RandomAccessFile;

public class RAF {

    static final int NAME_SIZE = 20;     // 20 characters
    static final int RECORD_SIZE = NAME_SIZE * 2 + 4; 
    // 20 chars * 2 bytes each + 4 bytes for int = 44 bytes

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("students.dat", "rw");

            // 1. Write 3 records
            writeRecord(raf, "Griot", 22);
            writeRecord(raf, "Alice", 20);
            writeRecord(raf, "Bob", 25);

            System.out.println("=== Before Update ===");
            readAllRecords(raf);

            // 2. Update the 2nd record (Alice → UpdatedAlice)
            long secondRecordPosition = RECORD_SIZE;  // start of 2nd record
            raf.seek(secondRecordPosition);
            writeRecord(raf, "UpdatedAlice", 23);

            System.out.println("\n=== After Update ===");
            readAllRecords(raf);

            // 3. Read a specific record
            System.out.println("\n=== Reading 3rd Record Only ===");
            raf.seek(RECORD_SIZE * 2);  // position for 3rd record
            System.out.println(readRecord(raf));

            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Write one fixed-length record
    private static void writeRecord(RandomAccessFile raf, String name, int age) throws Exception {
        // pad or trim the name to 20 characters
        StringBuilder sb = new StringBuilder(name);
        sb.setLength(NAME_SIZE);

        // write 20 chars = 40 bytes
        raf.writeChars(sb.toString());

        // write age
        raf.writeInt(age);
    }

    // Read all records
    private static void readAllRecords(RandomAccessFile raf) throws Exception {
        raf.seek(0); // reset pointer to start
        long numRecords = raf.length() / RECORD_SIZE;

        for (int i = 0; i < numRecords; i++) {
            System.out.println(readRecord(raf));
        }
    }

    // Read a single record
    private static String readRecord(RandomAccessFile raf) throws Exception {
        char[] nameChars = new char[NAME_SIZE];

        for (int i = 0; i < NAME_SIZE; i++) {
            nameChars[i] = raf.readChar();
        }

        String name = new String(nameChars).trim();
        int age = raf.readInt();

        return name + " - " + age;
    }
}

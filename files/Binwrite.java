import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binwrite{

    // Path to output binary file
    private static final String FILE_NAME = "output.bin";

    public static void main(String[] args) {
        try {
            // The 5-bit pattern to store: 10101 (binary) = 21 (decimal)
            int fiveBitValue = 0b10101; // Java 7+ binary literal
            // alternative: int fiveBitValue = 21;

            // Write the single byte containing the 5 bits
            writeFiveBitsToBin(FILE_NAME, fiveBitValue);

            // Read back and display the stored 5 bits
            readAndPrintFiveBits(FILE_NAME);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    /**
     * Writes the 5-bit value into a .bin file as a single byte.
     * Upper 3 bits are left 0; lower 5 bits store the pattern.
     */
    private static void writeFiveBitsToBin(String filePath, int fiveBitValue) throws IOException {
        if (fiveBitValue < 0 || fiveBitValue > 0b11111) {
            throw new IllegalArgumentException("Value must fit in 5 bits (0..31).");
        }

        File outFile = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            // We write a single byte. Only lower 5 bits are meaningful (others are zero).
            byte b = (byte) (fiveBitValue & 0x1F); // mask to 5 bits
            fos.write(b);
           
            System.out.println("Wrote 5-bit pattern to " + outFile.getAbsolutePath());
        }
    }

    /**
     * Reads the single byte from the file and prints the lower 5 bits as '1'/'0' in MSB->LSB order.
     */
    private static void readAndPrintFiveBits(String filePath) throws IOException {
        File inFile = new File(filePath);
        if (!inFile.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }
        try (FileInputStream fis = new FileInputStream(inFile)) {
            int read = fis.read();
            if (read == -1) {
                System.out.println("File is empty.");
                return;
            }

            // Mask lower 5 bits
            int lower5 = read & 0x1F; // 0x1F = 0001_1111

            // Build a string showing the 5 bits from most-significant-of-the-5 to least
            StringBuilder bits = new StringBuilder(5);
            for (int i = 4; i >= 0; i--) { // i=4 is the leftmost of the 5 bits
                int bit = (lower5 >> i) & 1;
                bits.append(bit);
            }

            System.out.println("Read byte (decimal): " + read);
            System.out.println("Lower 5 bits read as: " + bits.toString()); // should print 10101
        }
    }
}

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZIP {

    public static void main(String[] args) throws Exception {

        // 1. Create a TXT file
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("This is a sample text file.");
        fw.close();

        // 2. Create a PNG file (simple empty placeholder)
        FileOutputStream fosImg = new FileOutputStream("image.png");
        fosImg.write(new byte[]{(byte)137, 80, 78, 71});  // PNG signature
        fosImg.close();

        // 3. Create ZIP file
        FileOutputStream fos = new FileOutputStream("output.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        addToZip("sample.txt", zos);
        addToZip("image.png", zos);

        zos.close();
        fos.close();

        System.out.println("✔ TXT and PNG created and zipped successfully.");
    }

    private static void addToZip(String fileName, ZipOutputStream zos) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        zos.putNextEntry(new ZipEntry(fileName));

        byte[] buffer = new byte[1024];
        int len;

        while ((len = fis.read(buffer)) > 0) {
            zos.write(buffer, 0, len);
        }

        zos.closeEntry();
        fis.close();
    }
}

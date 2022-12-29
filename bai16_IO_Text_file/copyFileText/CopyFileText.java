package bai16_IO_Text_file.copyFileText;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File("Java/src/bai16_IO_Text_file/copyFileText/data1"));
            outputStream = new FileOutputStream(new File("Java/src/bai16_IO_Text_file/copyFileText/data2"));
            int length;
            byte [] buffer = new byte[1000];
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File data1 copy to data2 thành công");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }

    }
}

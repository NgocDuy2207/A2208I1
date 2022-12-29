package bai16_IO_Text_file.docFile;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// public class Main {
//    public static void main(String[] args) {
//    readFile("Java/src/bai16_IO_Text_file/docFile/dataCountry");
//    }
//    static List<String> readFile(String pathFile){
//        List<String> stringList = new ArrayList<>();
//        File file = new File(pathFile);
//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;
//        if (file.length() >0){
//            try {
//                fileInputStream = new FileInputStream(file);
//                objectInputStream = new ObjectInputStream(fileInputStream);
//                stringList = (List<String>) objectInputStream.readObject();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        return stringList;
//    }

//}

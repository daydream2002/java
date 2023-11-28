package month11;

import java.io.*;
import java.util.*;
import java.util.function.IntFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File src = new File("D:\\desktop\\java\\java\\zip");
        File dest = new File(src.getParentFile() ,src.getName() + ".zip");
        System.out.println(dest);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        toZip(src,zos,"");
        zos.close();

    }
    public static void toZip(File src,ZipOutputStream zos,String filename) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                ZipEntry entry = new ZipEntry(filename+"\\"+file.getName());
                System.out.println(entry);
                FileInputStream fis = new FileInputStream(file);
                zos.putNextEntry(entry);
                int i;
                while ((i=fis.read())!=-1){
                    zos.write(i);
                }
                fis.close();
                zos.closeEntry();
            }else {
                ZipEntry entry = new ZipEntry(file.toString());
                zos.putNextEntry(entry);
                System.out.println(file);
                toZip(file,zos,filename);
            }

        }
    }
}


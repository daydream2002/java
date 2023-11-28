package month11;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.IntFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = FileUtil.file("D:\\desktop\\java\\java\\a\\a\\a.txt");
        File touch = FileUtil.touch(file);
        //System.out.println(touch);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        File file1 = FileUtil.writeLines(list, file, "UTF-8");
        FileUtil.appendLines(list,file, StandardCharsets.UTF_8);

        List<String> list1 = FileUtil.readLines(file, StandardCharsets.UTF_8);
        System.out.println(list1);
    }
}
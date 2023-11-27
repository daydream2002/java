package month11;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        File src = new File("./1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(src, Charset.forName("gbk")));
        System.out.println((char) bufferedReader.read());

    }
}
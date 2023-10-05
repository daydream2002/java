package JavaLearn.string;

public class demo13 {//计算最后一个单词的长度
    public static void main(String[] args) {
        String str="hello world ni hao";
        int count=0;
        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i)==' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}

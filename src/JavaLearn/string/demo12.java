package JavaLearn.string;

public class demo12 {
    public static void main(String[] args) {
      String num1="123456";
      String num2="123";
      int nm1=String2num(num1);
      int nm2=String2num(num2);
      int ans=nm1*nm2;
        System.out.println("答案"+ans);
      String a=num2String(ans);
        System.out.println(a);
    }
    public static int String2num(String str){
        char[] ch = str.toCharArray();
        int num=0;
        for (int i = ch.length-1; i >= 0; i--) {
            int a = ch[i]-'0';
            num=num+a*(int)(Math.pow(10,(ch.length)-1-i));
        }
        System.out.println(num);
        return num;
    }
    public static String num2String(int num){
        StringBuilder sb=new StringBuilder();
        while (num!=0){
            int ge=num%10;
            sb.insert(0,ge);
            num=num/10;
        }
        return sb.toString();
    }
}

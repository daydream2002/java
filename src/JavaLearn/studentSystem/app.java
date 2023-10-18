package JavaLearn.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<User> list=new ArrayList<>();
        String choose;
        while (true){
            System.out.println("1:注册");
            System.out.println("2.登录");
            System.out.println("3.忘记密码");
            System.out.println("忘记密码");
            choose= sc.next();
            switch (choose){
                case "1"-> register(list);
                case "2"-> login(list);
                case "3"-> changepassword(list);
                case "4"-> test(list);
                default -> {
                    System.out.println("请重新输入");
                    break;
                }
            }
        }
    }
    public static void changepassword(ArrayList<User> list){

    }
    public static void login(ArrayList<User> list){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++) {
            String username;
            System.out.println("请输入用户名");
            username= sc.next();
            int index=getUserIndex(list,username);
            if (index==-1){
                System.out.println("用户不存在");
                return;
            }
            System.out.println("请输入密码");
            String password=sc.next();
            while (true) {
                String code=generateCode();
                System.out.println("验证码:"+code);
                System.out.println("请输入验证码");
                String verifycode=sc.next();
                if (!code.equals(verifycode)){
                    System.out.println("验证码错误，请重新输入验证码");
                }else {
                    break;
                }
            }
            if (list.get(index).getPassword().equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误重新输入,还有"+(2-i)+"机会");
            }
        }


    }
    public static String generateCode(){
        Random rd=new Random();
        char[] ch=new char[52];
        for (int i = 0; i < 26; i++) {
            ch[i]= (char) ('a'+i);
        }
        for (int i = 26; i < 52; i++) {
            ch[i]= (char) ('A'+i-26);
        }
        int index= rd.nextInt(5);
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int codeindex= rd.nextInt(52);
            code.append(ch[codeindex]);
        }
        int number=rd.nextInt(10);
        code.insert(index,number);
        return code.toString();
    }
    public static int getUserIndex(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }
    public static void register(ArrayList<User> list){
        Scanner sc=new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username=sc.next();
            boolean flag=verifyUserName(list,username);
            if (!flag){
                System.out.println("请重新输入");
            }else {
                break;
            }
        }
        String password,password2;
        while (true) {
            System.out.println("请输入密码");
            password=sc.next();
            System.out.println("请再次输入密码");
            password2=sc.next();
            if (!password.equals(password2)){
                System.out.println("两次密码不一致，请重新输入");
            }else{
                break;
            }
        }
        String idNumber;
        while (true){
            System.out.println("请输入身份证号码");
            idNumber= sc.next();
            boolean flag=verifyidNumber(idNumber);
            if (flag){
                break;
            }
            else {
                System.out.println("请重新输入");
            }
        }
        String phoneNumber;
        while (true){
            System.out.println("请输入手机号");
            phoneNumber=sc.next();
            boolean flag=verifyphoneNumber(phoneNumber);
            if (flag){
                break;
            }
            else {
                System.out.println("请重新输入");
            }
        }
        User u=new User(username,password,idNumber,phoneNumber);
        list.add(u);

    }
    public static boolean verifyUserName(ArrayList<User> list,String username){
        int index=getIndex(list,username);
        int count=0;
        if (index!=-1){
            System.out.println("用户名重复");
            return false;
        }
        if (username.length()<3||username.length()>15){
            System.out.println("用户名长度不在3-15之间");
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            if (!(username.charAt(i)>'a'&&username.charAt(i)<'z'||username.charAt(i)>'A'&&username.charAt(i)<'Z'
                    ||username.charAt(i)>'0'&&username.charAt(i)<'9')){
                System.out.println("用户名为字母加数字的组合");
            }
            if (username.charAt(i)>'a'&&username.charAt(i)<'z'||username.charAt(i)>'A'&&username.charAt(i)<'Z'){
                count++;
            }
        }
        if (count==0){
            System.out.println("密码不能是纯数字");
            return false;
        }
        return true;

    }
    public static int getIndex(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }
    public static boolean verifyidNumber(String idNumber){
        if (idNumber.length()!=18){
            System.out.println("长度需要为18");
            return false;
        }
        if (idNumber.charAt(0)=='0'){
            System.out.println("不能以0开头");
            return false;
        }
        for (int i = 0; i < idNumber.length()-1; i++) {
            if (idNumber.charAt(i)<'0'||idNumber.charAt(i)>'9'){
                System.out.println("前17位只能包含数字");
                return false;
            }
        }
        if (!(idNumber.charAt(idNumber.length()-1)=='x'||idNumber.charAt(idNumber.length()-1)=='X'||idNumber.charAt(idNumber.length()-1)>'0'&&idNumber.charAt(idNumber.length()-1)<'9')){
            System.out.println("第18位不正确");
            return false;
        }
        return true;
    }
    public static boolean verifyphoneNumber(String phoneNumber){
        if (phoneNumber.length()!=11){
            System.out.println("长度需要为11");
            return false;
        }
        if (phoneNumber.charAt(0)=='0'){
            System.out.println("不能以0开头");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i)<'0'||phoneNumber.charAt(i)>'9'){
                System.out.println("只能包含数字");
                return false;
            }
        }
        return true;
    }
    public static void test(ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername()+"   "+list.get(i).getPassword()+"   "+list.get(i).getIdNumber()
            +"   "+list.get(i).getPhoneNumber());
        }
    }

}

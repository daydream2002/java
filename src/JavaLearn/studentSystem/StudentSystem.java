package JavaLearn.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("--------欢迎来到学术管理系统-------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");
    }
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("删除学生");
    }
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
    }
    public static void queryStudent(ArrayList<Student> list){
        if (list.isEmpty()){
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
    }
}

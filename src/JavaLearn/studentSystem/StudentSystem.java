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
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入id");
        String id = sc.next();
        boolean flag=uniqueID(list,id);
        if (!flag){
            System.out.println("id重复   添加失败");
            return;
        }
        Student student=new Student();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入地址");
        String address = sc.next();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        list.add(student);
        System.out.println("学生信息添加成功");
    }
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要删除的id");
        String id= sc.next();
        int index = idExist(list,id);
        if (index>=0){
            list.remove(index);
            System.out.println("删除成功");
        }else {
            System.out.println("id不存在，删除失败");
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要修改的id");
        String id= sc.next();
        int index = idExist(list,id);
        if (index>=0){
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            System.out.println("请输入地址");
            String address = sc.next();
            list.get(index).setName(name);
            list.get(index).setAge(age);
            list.get(index).setAddress(address);
            System.out.println("修改成功");
        }else {
            System.out.println("id不存在");
        }
    }
    public static void queryStudent(ArrayList<Student> list){
        if (list.isEmpty()){
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        else {
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getAge());
            }
        }
    }
    public static boolean uniqueID(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return false;
            }
        }
        return true;
    }
    public static int idExist(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}

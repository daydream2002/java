package JavaLearn.learn3;

public class Test {
    public static void main(String[] args) {
        Student[] list = new Student[3];
        Student student1 = new Student(1, "张三", 18);
        Student student2 = new Student(2, "李四", 19);
        Student student3 = new Student(3, "王五", 20);
        list[0] = student1;
        list[1] = student2;
        list[2] = student3;
        Student student4 = new Student(3, "老六", 66);
        int count=Getcount(list);
        boolean flag= contains(list,student4.getId());
        if (flag){
            System.out.println("学号相同，请重新输入");
        }
        else {
            if (count==3){
                Student[] newlist=new Student[list.length+1];
                for (int i = 0; i < count; i++) {
                    newlist[i]=list[i];
                }
                newlist[newlist.length-1]=student4;
                list=newlist;
            }
            else {
                list[count]=student4;
            }
            count++;
            for (int i = 0; i < count; i++) {
                System.out.println(list[i].getId()+list[i].getName()+list[i].getAge());
            }
        }

    }
    public static boolean contains(Student[] list, int id){
        for (int j = 0; j < list.length; j++) {
            if (list != null) {
                if (list[j].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int Getcount(Student[] list){
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if(list!=null){
                count++;
            }
        }
        return count;
    }

}

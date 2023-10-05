package JavaLearn.string;

public class demo5 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String ans=arrToString(arr);
        System.out.println(ans);

    }
    public static String arrToString(int[] arr){
        if (arr==null){
            return "";
        }
        if (arr.length==0){
            return "[]";
        }
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            result=result +','+ arr[i];
        }
        result=result+"]";
        return result;
    }
}

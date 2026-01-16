package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        intNum(5);

    }
    static void intNum(int num){
        if(num==0) return;
//        System.out.println(num);
        intNum(num-1);
        System.out.println(num);
    }
}
//C:\Users\arnab\IdeaProjects\Arrays
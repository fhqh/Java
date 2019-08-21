package project_02;
/*
-------------------------------------------------------------------------
题目：随机数的实例————01
-------------------------------------------------------------------------
*/
public class P_01 {
    public static void main(String[] args) {
        System.out.println("Math.random()=" + Math.random());// 结果是个double类型的值，区间为[0.0,1.0）
        int num = (int) (Math.random() * 3); //注意不要写成(int)Math.random()*3，这个结果为0，因为先执行了强制转换
        System.out.println("num=" + num);
    }
}

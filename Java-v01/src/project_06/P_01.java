package project_06;

/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：siki第二季学习
创建手机类，分析一个手机类有哪些属性和行为。为属性创建getter和settter方法，并创建手机类
的构造器。
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_01 {
    public static void main(String[] args) {
        phone p_1 = new phone();
        System.out.println(p_1.getBrand() + "\t" + p_1.getPrice() + "\t" + p_1.getColor());
        phone p_2 = new phone("iphone", 1000, "red");
        System.out.println(p_2.getBrand() + "\t" + p_2.getPrice() + "\t" + p_2.getColor());
    }
}
class phone {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        if (price >= 0){
            this.price = price;
        }
        else{
            System.out.println("您输入的手机价格不太合理，请检查一下重新输入！");
        }
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void call(String name){
        System.out.println("给" + "name" + "打电话！");
    }

    public phone(){

    };
    public phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}

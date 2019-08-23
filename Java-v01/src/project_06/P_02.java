package project_06;
/*
--------------------------------------------------------------------------------------------------------------------------------------------------
题目：static的一线简单的猜测。
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_02 {
    public static void main(String[] args) {
        Person p1 = new Person(23, "nike");
        p1.country = "China";
        System.out.println(p1.name + "的年龄是：" + p1.age + "他的国籍是：" + p1.country);

        Person p2 = new Person(12, "LiMei");
        p1.country = "American";
        System.out.println(p2.name + "的年龄是：" + p2.age + "他的国籍是：" + p2.country);

        System.out.println(p1.name + "的年龄是：" + p1.age + "他的国籍是：" + p1.country);
/*
--------------------------------------------------------------------------------------------------------------------------------------------------
nike的年龄是：23他的国籍是：China
LiMei的年龄是：12他的国籍是：American
nike的年龄是：23他的国籍是：American
static所定义的值在未发生是，它之前定义的值被回收。静态的变量只保留一份，既最后定义的那一份。
---------------------------------------------------------------------------------------------------------------------------------------------------
*/
    }
}

class Person {
    public static String country;
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}

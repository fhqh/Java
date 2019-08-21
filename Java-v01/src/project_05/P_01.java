package project_05;

/*
--------------------------------------------------------------------------------------------------------------------------------------------------
方法的初步使用————01————无参数类型
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
public class P_01 {
    public static void main(String[] args) {
        createEnemy();
        createEnemy();
        createEnemy();
    }

    public static void createEnemy() {
        System.out.println("1.创建模型");
        System.out.println("2.设置位置");
        System.out.println("3.添加特效");
        System.out.println("4.添加AI(人工智能)");
        System.out.println();
    }
}

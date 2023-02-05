import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Level1 level1 = new Level1(22, "Didi");
        Level2 level2 = new Level2(21, "Bibi");
        Level3 level3 = new Level3(19, "Jordj");
        System.out.println(level3.getInfo());
        System.out.println("======");
        System.out.println(level1.getInfo());
        System.out.println("====");
        System.out.println(level2.getInfo());
        System.out.println("=====");
        level1.getName();
        level1.getName("didi");
        level2.Name();
        level2.getName("bibi");
        }
    }



public class Level1 {
    private String name;
    private int age;
    public Level1(int age, String name){
    this.age = age;
    this.name = name;
}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }
    public String getInfo(){
        return "Age" + age + "\nName" + name;

    }
}



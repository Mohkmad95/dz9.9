public class Level2 extends Level1 {
    private int age;

    public String getInfo(){
        return super.getInfo() + "\nAge";
    }
    public Level2(int age,String name){
        super(age, name);
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void Name(){
        System.out.println("ПО СКОРЕЕ БЫ ПЕРЕЙТИ НА КОТЛИН");
    }
     public void Age(){
         System.out.println("И АНДРОИД СТУДИЯ");
     }
     public final void hf(){
         System.out.println("JAVA тяжелыыыый");
     }
        }


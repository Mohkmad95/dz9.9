public final class Level3 extends Level1{
        private int age;
        public String getInfo(){
            return super.getInfo() + "\nAge" + age;
        }
        public Level3(int age, String name){
            super(age, name);
            this.age = age;
        }
        public int getAge(){
            return age;
    }

    @Override
    public void getName(String name) {
        super.getName(name);
        System.out.println("Я БЫ СДЕЛАЛ БОЛЬШЕ НО БЫЛИ ПРИЧИНЫ ЧТО СДЕЛАЛ МАЛО( ПОТЕРЯЛ БЛИЗКОГО ЧЕЛОВЕКА)");
    }
}



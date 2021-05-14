package day_43_Class_Objects;

public class Test3 {
    public static void main(String[] args) {
        Studen studen1 = new Studen();
        studen1.setName("Ahmet");
        System.out.println(studen1.getName());
    }
}


class Studen{
    private String name;
    public void setName(String name1){
        name = name1;
    }
    public String getName(){
        return name;
    }
}

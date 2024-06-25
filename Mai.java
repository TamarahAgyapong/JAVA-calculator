
class Animals{
    void makesound(){
        System.out.println("Lets see what this animal does");

    }
}
class Cat extends Animals{
    @Override
    void makesound(){
        System.out.println("yes of course his one works");
    }
}

public class Mai{
    public static void main(String[]args){
        Animals p3=new Animals();
        p3.makesound();
        Cat p4=new Cat();
        p4.makesound();
    }
}
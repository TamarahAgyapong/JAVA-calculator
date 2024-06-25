class Animal{
    void move(){
        System.out.println("the animal move is ");
        class Cheetah extends Animal {
            @Override
            void move(){
                System.out.println("Lets now make the cheeta move");
            }
        }
    }
}
public class main{
    public static void main(String[] args) {
        
    
        Animal p1 = new Animal();
        p1.move();
        Cheetah p2 = new Cheetah();
        p2.move();
    }
}
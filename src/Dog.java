

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog loves to eat");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bau, bau");
    }

    public void run(){
        System.out.println("Dog is running");
    }
}

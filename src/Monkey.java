public class Monkey extends Animal{

    @Override
    public void makeSomeNoise() {
        System.out.println("Monkey makes some noise");
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats");
    }

    @Override
    public void breathe() {
        System.out.println("Monkey breathes");
    }

    public void jump(){
        System.out.println("Monkey jumps");
    }
}

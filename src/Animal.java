public abstract class Animal implements IAnimal{
    private double weight;
    private int age;
    private String species;


    @Override
    public void makeSomeNoise() {
        System.out.println("Animal makes some noises");
    }

     public void breathe() {
            System.out.println("Breathing ...");
        }

     public abstract void eat();
    }


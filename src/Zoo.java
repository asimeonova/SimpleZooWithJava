public class Zoo implements IZoo{

    private IAnimal[] animals;
    private int cages;


    public Zoo(int cages) {
        this.animals = new Animal[cages];
    }

    @Override
    public IAnimal[] getAnimals() {
        return this.animals;
    }

    @Override
    public void addAnimal(IAnimal animalToAdd) {
        for (int i=0; i< animals.length; i++){
            if (animals[i]==null){
                animals[i]=animalToAdd;
                return;
            }
        }
        System.out.println("No more free cages for the animals");
    }
}




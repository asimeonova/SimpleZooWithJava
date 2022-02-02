public class ZooDemo {

    public static void main(String[] args) {
	Zoo  zoologicalGarden = new Zoo(15);

	Eagle eagle = new Eagle();
	Dog poodle = new Dog();
	Monkey monkey = new Monkey();
	IAnimal pug = new Dog();
	Animal labrador= new Dog();

	zoologicalGarden.addAnimal(eagle);
	zoologicalGarden.addAnimal(poodle);
	zoologicalGarden.addAnimal(monkey);
	zoologicalGarden.addAnimal(pug);
	zoologicalGarden.addAnimal(labrador);

	IAnimal[] allZooAnimals= zoologicalGarden.getAnimals();

	for (int i=0; i<allZooAnimals.length; i++){
	    if(allZooAnimals[i]!= null){
	        allZooAnimals[i].makeSomeNoise();
        }
    }
    }
}



package oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Generic Animal", "Some sound", 4);
        Dog d = new Dog("Dog", "Bark", 4, "Labrador");
        Bird b = new Bird("Bird", "Chirp", 2, true);
        Fish f = new Fish("Fish", "Blub", 0, "Fresh");
		

        a.speak();
        d.speak();
        b.speak();
        f.speak();
        b.fly();
        f.swim();

        System.out.println();
        Animal[] animals = new Animal[4];
        animals[0] = a;
        animals[1] = d;
        animals[2] = b;
        animals[3] = f;

        // Loop and call speak()
        for (Animal animal : animals) {
            animal.speak();
        }
	

}
}
class Animal {
	String name;
	String sound;
	int legs;
	public Animal(String name, String sound, int legs) {
		super();
		this.name = name;
		this.sound = sound;
		this.legs = legs;
	}
void speak() {
	System.out.println(this.name+" makes this " +this.sound);
}
	
}
class Dog extends Animal{
	String breed;

	public Dog(String name, String sound, int legs, String breed) {
		super(name, sound, legs);
		this.breed = breed;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		
		System.out.println(this.name+" makes " +this.sound+" sounds and has "+this.legs+" legs and wags tail" );
	}
	
}
class Bird extends Animal{
	boolean canFly;

	public Bird(String name, String sound, int legs,boolean canFly) {
		super(name, sound, legs);
		this.canFly = canFly;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void speak() {
		System.out.println(this.name+" makes " +this.sound+"sounds and has "+this.legs+" legs" );
	}
	void fly(){
		if(this.canFly)
		System.out.println(this.name+ " can fly");
		else 
			System.out.println(this.name+ "cant fly" );
		
		
	}
}
class Fish extends Animal{
	String waterType;

	public Fish(String name, String sound, int legs,String waterType) {
		super(name, sound, legs);
		this.waterType = waterType;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void speak() {
		System.out.println(this.name+" makes this " +this.sound+" sounds and has "+this.legs+"legs");
	}
	 void swim() {
	        System.out.println(name + " swims in " + waterType + " water");
	    }
}

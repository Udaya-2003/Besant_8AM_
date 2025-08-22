package opps_concept;
class Animal{
	Animal(){
		System.out.println("Animal Constructor");
	}
	Animal(String type){
		System.out.println("Animal Constructor"+type);
	}
	void sound() {
		System.out.println("Animal makes sounds");
	}
	void sound(String type) {
		System.out.println(type+"sound");
	}
	
}
class Dog extends Animal{
	Dog(){
		System.out.println("Dog constructor");
	}
	Dog(String name){
		System.out.println("Dog constructor"+name);
	}
	@Override
	void sound() {
		System.out.println("dog barks");
	}
	
}

public class Functions_all {
	public static void main (String []args) {
		Animal a= new Animal();
		Animal a1= new Animal("wild");
		a.sound();
		a.sound("roar");
		Dog d1=new Dog();
		d1.sound();
		Dog d2=new Dog("buddy");
	}

}

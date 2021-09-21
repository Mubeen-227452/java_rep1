package selflearn_full;
class Animal{
	void eat() {
		System.out.println("eating.....");
	}
}
class Dog extends Animal{	//single inheritance A----B
	void bark() {
		System.out.println("barking.....");
	}
}
class BabyDog extends Dog{	//multilevel inheritance A----B-----c
	void weep() {
		System.out.println("Weeping...");
	}
}
class Cat extends Animal{	//Hierarchical inhetance B---A----c or A---B,A----c
	void meow() {
		System.out.println("meowing");
	}
}
public class Inheritance_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		System.out.println("Single A----B");
		Dog d=new Dog(); ///object of single inheritance
		d.bark();
		d.eat();
		System.out.println("Mulilevel A----B----C");
		BabyDog b=new BabyDog();///object of multilevel 
		b.bark();
		b.eat();
		b.weep();
		System.out.println("Hierarchical A----B,A----C");
		Cat c=new Cat();//object of hierarchical inheritance we don't have access of bark in this
		c.eat();
		c.meow();
	}

	

}

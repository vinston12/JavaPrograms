package meta2;

import javax.swing.plaf.synth.SynthSeparatorUI;

class TV{
	private int size;	
	private String name;
	private boolean onOff;
	
		public TV(int aSize, String aName) {
			this.size = aSize;
			this.name = aName;
		}
		public int getSize() {
			return size;
		}
		public String getName() {
			return name;
		}
		public void setonOff(boolean a) {
			onOff = a;
		}
		public void getonOff() {
			if (onOff) {
				System.out.println("Tv is running now");
			}
			else 
				System.out.println("Tv is off now");
		}

	}
class Animal {
	private int size;
	private String speak;
	private String name;
	
	public void setSpeak(String speak) {
		/*akcesor do którego przypisujemy co mówi pies, np. woof woof, 
		podajemy dopiero w metodzie main podczas tworzenia obiektu o w³asnej nazwie*/
		this.speak = speak;
	}
	
	public void setSize(int size) {
		this.size = size;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getSize() {
		//mutator który zwraca nam wielkoœæ
		return size;
	}
	public String getSpeak() {
		return speak;
}
	public String getName() {
		return name;
	}
}
class Furniture{
	//klasa meble
	private String room;
	private double size;
	private String material;
	public Furniture(String room, double size, String material) {
		
		this.room = room;
		this.size = size;
		this.material = material;
	}
		
	
	public String getRoom() {
		return room;
	}
	public double getSize(String j) {
			if (j=="m") {
				return size=size/100;
			}
			else
		return size;
	}
	public String getMaterial() {
		return material;
	}
	
	
	
}
class CarInMyHouse extends Samochód{
	
}
class People {
	String full_name;
	int age;
	public People(String full_name,int age){
		this.full_name=full_name;
		this.age=age;
	}
	public String getFullName() {
		return full_name;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class Home {
public static void main(String[] args) {
	People Dominik = new People("Dominik Bober",17);
	People Agnieszka = new People("Agnieszka Bober",40);
	People Daniel = new People("Daniel Bober",41);
	System.out.println("Hello guys!\nThis is our family(Me: " + Dominik.getFullName() + ", my mother: " + Agnieszka.getFullName() + " and my Dad: " + Daniel.getFullName() + ")");
	System.out.println("Im " + Dominik.getAge()+"\nMy mother is: "+Agnieszka.getAge()+"\nMy dad is: "+Daniel.getAge());
	System.out.println();
	System.out.println("Now, somethig about my house: ");
	System.out.println("There is 2 TV in my house: ");
	TV philips = new TV(45, "Philips");
	TV samsung = new TV(32, "Samsung");
	System.out.println("1." + samsung.getName() + " " + samsung.getSize()+" inches");
	System.out.println("2." +philips.getName() + " " + philips.getSize()+" inches");
	System.out.println();
	
	samsung.setonOff(false);
	samsung.getonOff();
	
	System.out.println();
	

	Dog rex = new Dog();
	Cat wili = new Cat();
	rex.setName("Rex");
	wili.setName("Wili");
	
	System.out.println("Also i have Dog and Cat! \nDog's name : " + rex.getName() + " \nCat's name: " + wili.getName());
	rex.setSpeak("Woof Woof");
	wili.setSpeak("Meow Meow");
	System.out.println("Sound of the dog: " + rex.getSpeak());
	System.out.println("Sound of the cat: " + wili.getSpeak());
	rex.setSize(15);
	wili.setSize(11);
	System.out.println("Size of the dog: " + rex.getSize() + "cm");
	System.out.println("Size of the cat: " + wili.getSize() + "cm");
	System.out.println();
	rex.setYears(2);
	wili.setYears(1.5);
	System.out.println("Dog is " + rex.getYears() + " yrs old");
	System.out.println("Cat is " + wili.getYears() + " yrs old");
	System.out.println();
	System.out.println("Now, furnitures in house: ");
	
	System.out.println();
	
	Furniture commode = new Furniture("Bedroom", 185, "leather");
	Furniture myOwnBed = new Furniture("My Room", 245, "Wood and foam");
	Furniture myOwnDesk = new Furniture("My Room",65, "Wood");
	Furniture myParentsBed = new Furniture("Parents Room", 255, "Wood and foam");
	Furniture chairsInKitchen = new Furniture("Kitchen",100, "wood and plastic");
	
	System.out.println("Furniture: Commode,   \n In room: " + commode.getRoom() + "\n Size: " + commode.getSize("m")+"m "+ "\n Material: " + commode.getMaterial());
	System.out.println();
	System.out.println("Furniture: My own bed,  \n In room: " + myOwnBed.getRoom() 	 + "\n Size: " + myOwnBed.getSize("m")+"m "+ "\n Material: " + myOwnBed.getMaterial());
	System.out.println();
	System.out.println("Furniture: My Own desk,   \n In room: " + myOwnDesk.getRoom() 	 + "\n Size: " + myOwnDesk.getSize("cm") +"cm "+ "\n Material: " + myOwnDesk.getMaterial());
	System.out.println();
	System.out.println("Furniture: Parents bed,   \n In room: " + myParentsBed.getRoom() 	 + "\n Size: " + myParentsBed.getSize("m") +"m "+ "\n Material: " + myParentsBed.getMaterial());
	System.out.println();
	System.out.println("Furniture: chairs,   \n In room: " + chairsInKitchen.getRoom() 	 + "\n Size: " + chairsInKitchen.getSize("m") +"m "+ "\n Material: " + chairsInKitchen.getMaterial());
	
}
}

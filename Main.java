// Concrete Class - Driver/Tester Class...
// ...because it includes the main() method
public class Main 
{
	// This is the main() method that starts our program
   public static void main(String args[])
   {
	// OBJECT/INSTANCE CREATION using Parameterized Constructors
	Bird birdObject1 = new Bird("Vince", false, true);
	Dog dogObject1 = new Dog("Spot", true, false);
	Fish fishObject1 = new Fish("Dory", true, false);

	System.out.println("\n=======================================");
	System.out.println("Print BIRD OBJECT # 1 using toString()");
	System.out.println("=======================================");
	System.out.println(birdObject1); // print birdObject1 with toString()


	System.out.println("\n=======================================");
	System.out.println("Print BIRD OBJECT #1 using toString()" +
						"\nafter changing name and isFemale.");
	System.out.println("=======================================");
	birdObject1.setName("Brenda"); // change name of birdObject1
	birdObject1.setIsFemale(true); // change gender of birdObject1
	System.out.println(birdObject1); // print birdObject1 with toString()

	System.out.println("\n===========================================");
	System.out.println("Call INSTANCE METHODS individually" +
					   "\nusing the birdObject1.instanceMethodName()");
	System.out.println("==========================================");
	System.out.println("FORMAT:\t\tobjectName.instanceMethodName()");
	System.out.println("BIRD NAME:\t" + birdObject1.getName());
	System.out.println("IS FEMALE:\t" + birdObject1.getIsFemale());
	System.out.println("CAN FLY:\t" + birdObject1.getCanFly());
	System.out.println("SOUND:\t" + birdObject1.sound("hello"));
	System.out.println("EAT:\t" + birdObject1.eat("seeds"));
	System.out.println("MOVE:\t" + birdObject1.move(2));
	System.out.println("SLEEP:\t" + birdObject1.sleep(2.5));
	System.out.println("KILLED:\t" + birdObject1.killPrey(3));
	
	System.out.println("\n==================================");
	System.out.println("Call STATIC METHODS individually");
	System.out.println("==================================");
	System.out.println("FORMAT:\t\tClassName.staticMethodName()");
	System.out.println("BIRD COUNT: " + Bird.getBirdObjectCount());

	System.out.println("\n===========================================");
	System.out.println("Print DOG OBJECT with toString()");
	System.out.println("===========================================");
	System.out.println(dogObject1);
	
	System.out.println("\n============================================");
	System.out.println("Print FISH OBJECT with toString()");
	System.out.println("============================================");
	System.out.println(fishObject1);
   }
}


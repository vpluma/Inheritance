// Concrete Child/Derived/Sub Class
//Fish class extends Animal class
public class Fish extends Animal
{
	// instance variable - unique to each fish object
	private boolean isFreshWater;

	// static/class variable - one variable shared with all fish objects
	private static int fishObjectCount = 0;

	// No-Argument Constructor
	public Fish()
	{
		// super() calls Animal class' No-Arg Constructor
		super(); 
		this.isFreshWater = false;
		fishObjectCount ++;
	}

	// parameterized constructor
	public Fish(String name, boolean isFemale, boolean isFreshWater)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);  
		this.isFreshWater = isFreshWater;
		fishObjectCount ++;
	}

	// getter/accessor method
	public boolean getIsFreshWater()
	{
		return isFreshWater;
	}

	// setter/mutator method
	public void setIsFreshWater(boolean isFreshWater)
	{
		this.isFreshWater = isFreshWater;
	}

	// static/class getter method required to...
	// ...access static/class variables
	public static int getFishObjectCount()
	{
		return fishObjectCount;
	}

	// method overide - originally declared in abstract Animal class
	public String sound(String word)
	{
		return "This fish says... " + word;
	}

	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This fish swims " + minutes + " min(s)";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This fish sleeps " + hours + "hours with eyes open";
	}

	// method overide - originally declared in Hunt interface
	public String killPrey(int numPrey)
	{
		return "This fish killed " + numPrey + " crab(s).";
	}

	// Concrete - Instance method with Implementation
	public String eat(String food)
	{
		return "This fish eats " + food + " normally.";
	}

	// Method Overide - originally declared in Object class
	// Object class is the parent class of all classes in Java
	// If not overriden, Java will output the memory address
	public String toString()
	{
		return	"THIS FISH'S NAME IS: " + getName() + 
				"\nTHIS FISH IS FEMALE: " + getIsFemale() + 
				"\nFRESH WATER FISH: " + isFreshWater +
				"\nSOUND:\t" + sound("bubble, bubble") +
				"\nEAT:\t" + eat("shrimp") +
				"\nMOVE:\t" + move(10) +
				"\nSLEEP:\t" + sleep(1.5) +
				"\nKILLED:\t" + killPrey(2) +
				"\nFISH COUNT: " + fishObjectCount;
	}
}
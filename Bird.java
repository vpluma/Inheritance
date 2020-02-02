// Concrete Child/Derived/Sub Class
// Bird class extends Animal class
public class Bird extends Animal 
{
	// instance variable - unique to each bird object
	private boolean canFly;

	// static/class variable - one variable shared with all bird objects
	private static int birdObjectCount = 0;

	// No-Argument Constructor
	public Bird()
	{
		// super() calls Animal class' No-Arg Constructor
		super();  // must be on the first line
		this.canFly = true;
		birdObjectCount ++;
	}

	// parameterized constructor
	public Bird(String name, boolean isFemale, boolean canFly)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);  //must be on the first line
		this.canFly = canFly;
		birdObjectCount ++;
	}

	// getter/accessor method
	public boolean getCanFly()
	{
		return canFly;
	}

	// setter/mutator method
	public void setCanFly(boolean canFly)
	{
		this.canFly = canFly;
	}

	// static/class getter method required to...
	// ...access static/class variables
	public static int getBirdObjectCount()
	{
		return birdObjectCount;
	}

	// method overide - originally declared in abstract Animal class
	public String sound(String word)
	{
		return "This bird says..." + word;
	}
	
	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This bird flies for " + minutes + " min(s)";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This bird sleeps " + hours + " hours standing";
	}

	// method overide - originally declared in Hunt interface
	public String killPrey(int numPrey)
	{
		return "This bird killed " + numPrey + " rabbit(s).";
	}
	
	// Method Overide - originally declared in Object class
	// Object class is the parent class of all classes in Java
	// If not overriden, Java will output the memory address
	public String toString()
	{
		return	"THIS BIRD'S NAME IS: " + getName() + 
				"\nTHIS BIRD IS FEMALE: " + getIsFemale() + 
				"\nTHIS BIRD CAN FLY:\t " + canFly +
				"\nSOUND:\t" + sound("cheep, cheep") +
				"\nEAT:\t" + eat("fruit") +
				"\nMOVE:\t" + move(5) +
				"\nSLEEP:\t" + sleep(7.5) +
				"\nKILLED:\t" + killPrey(9) +
				"\nBIRD COUNT: " + birdObjectCount;
	}
}
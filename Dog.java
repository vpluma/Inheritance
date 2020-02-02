// Concrete Child/Derived/Sub Class
//Dog class extends Animal class
public class Dog extends Animal
{
	// instance variable - unique to each dog object
	private boolean isPureBreed;

	// static/class variable - one variable shared with all dog objects
	private static int dogObjectCount = 0;

	// No-Argument Constructor
	public Dog()
	{
		// super() calls Animal class' No-Arg Constructor
		super(); 
		this.isPureBreed = false;
		dogObjectCount ++;
	}

	// parameterized constructor
	public Dog(String name, boolean isFemale, boolean isPureBreed)
	{
		// super(name, isFemale) calls the...
		// ...Animal class' Parameterized Constructor
		super(name, isFemale);  
		this.isPureBreed = isPureBreed;
		dogObjectCount ++;
	}

	// getter/accessor method
	public boolean getIsPureBreed()
	{
		return isPureBreed;
	}

	// setter/mutator method
	public void setIsPureBreed(boolean isPureBreed)
	{
		this.isPureBreed = isPureBreed;
	}

	// static/class getter method required to...
	// ...access static/class variables
	public static int getDogObjectCount()
	{
		return dogObjectCount;
	}

	// method overide - originally declared in abstract Animal class
	public String sound(String word)
	{
		return "This dog says..." + word;
	}

	// method overide - orginally declared in Behavior interface
	public String move(int minutes)
	{
		return "This dog runs " + minutes + " min(s)";
	}

	// method overide - orginally declared in Behavior interface
	public String sleep(double hours)
	{
		return "This dog sleeps " + hours + "hours on their back";
	}

	// method overide defined in HUNT interface
	public String killPrey(int numPrey)
	{
		return "This dog killed " + numPrey + " squirrel(s).";
	}

	// Method Overide - originally declared in Object class
	// Object class is the parent class of all classes in Java
	// If not overriden, Java will output the memory address
	public String toString()
	{
		return	"THIS DOG'S NAME IS: " + getName() + 
				"\nTHIS DOG IS FEMALE: " + getIsFemale() + 
				"\nPURE BREED: " + isPureBreed +
				"\nSOUND:\t" + sound("ruff, ruff") +
				"\nEAT:\t" + eat("bones") +
				"\nMOVE:\t" + move(3) +
				"\nSLEEP:\t" + sleep(8.5) +
				"\nKILLED:\t" + killPrey(1) +
				"\nDOG COUNT: " + dogObjectCount;
	}
}
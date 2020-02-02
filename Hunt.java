// public and abstract are included by default
// ...and are optional
// interfaces allow Java to simulate multiple inheritance
public abstract interface Hunt
{
	// public is required for inheritance
	// static is required for class level variables
	// final prohibits changes to value
	// boolean is the data type
	// ISALIVE is the variable name
	// all caps means it's a constant variable
	public static final boolean ISHUNGRY = true;

	// Abstract Method Signatures w/o implementation
	// Abstract Method Signatures must be implemented or...
	// ...defined in a child concrete class but not in...
	// ...a child abstract class
	public abstract String killPrey(int numPrey);
}
// abstract parent/base/super class
// abstract classes cannot be instantiated
// implements the Behavior interface but does not...
// ...have to define inherited abstract methods sleep()...
// ...or move() because Animal class is abstract
public abstract class Animal implements Behavior, Hunt
{
	// ENCAPSULATED/private instance variables - passed to...
	// ...child classes by calling the parent/super constructor...
	// ...using super() or super(name, isFemale)
	// private instance variables are not inherited by child classes
	// public/protected instance variables are inherited by child classes
	private String name;
	private boolean isFemale;
	
	// No-Arg Constructor CALLED by child classes...
	// ...using super()
	public Animal()
	{
		this.name = "defaultConstructorName";
		this.isFemale = true;
	}

	// Parameterized Constructor CALLED by child classes...
	// ...using super(name, isFemale)
	public Animal(String name, boolean isFemale)
	{
		this.name = name;
		this.isFemale = isFemale;
	}

	// Getter or Accessor - Instance Method with Implementation
	public String getName()
	{
		return name;
	}
	// Getter or Accessor - Instance Method with Implementation
	public boolean getIsFemale()
	{
		return isFemale;
	}

	// Setter or Mutator - Instance Method with Implementation
	public void setName(String name)
	{
		this.name = name;
	}

	// Setter or Mutator - Instance Method with Implementation
	public void setIsFemale(boolean isFemale)
	{
		this.isFemale = isFemale;
	}

	// Abstract - Instance Method Declaration w/o Implementation
	public abstract String sound(String word);

	// Concrete - Instance method with Implementation
	public String eat(String food)
	{
		return "This animal eats " + food + " normally.";
	}
}

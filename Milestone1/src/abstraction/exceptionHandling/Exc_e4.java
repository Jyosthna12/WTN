package abstraction.exceptionHandling;
@SuppressWarnings("serial")
class InvalidCountryException extends Exception
{
public InvalidCountryException(String s)
{
	super(s);
}
}
public class Exc_e4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc_e4 in=new Exc_e4();
		try
		{
          in.registerUser("kalyan","india");
          in.registerUser("Ramu","us");
		}
		catch(InvalidCountryException ex)
		{
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
	void registerUser(String name,String country) throws InvalidCountryException
	{
		if(!country.equals("india"))
		{
				throw new InvalidCountryException("User Outside india cannot be registered");
		}
		else
		{
			System.out.println("User registration done Successfully");
		}
	}

}

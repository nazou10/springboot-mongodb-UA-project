package in.project.springbootmongodb.exeption;

public class TodoCollectionExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TodoCollectionExeption(String message) {
		super(message);
	}
	
	public static String NotFoundException(String id)
	{
		return "Todo with id "+id+" not found";
	}
	
	public static String TodoAlreadyExists()
	{
		return "Todo with given name already exists";
	}
	
}

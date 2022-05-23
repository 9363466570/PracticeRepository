
public interface ICalculator {
	
	public void addition(); 		// just creating the methods only, body will be specified in the
	public void subtraction();		// anonymous class, we are creating it in the main class 
	public void multiplication();
	public default void message() {    // we can make it as default because we are given the body 
		System.out.println("Welcome");
	}

}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		ICalculator calc = new ICalculator() {   // we are implementing a anonymous class (ie) calc 
			
			@Override                                       		// we are overriding those methods 
			public void subtraction() {								// from interface class Icalculator 
				System.out.println("Subtraction is: " + (10-5));
				
			}
			
			@Override
			public void addition() {
				System.out.println("Addition is: " + (5+5));	
			}

			@Override
			public void multiplication() {
				System.out.println("Multiplication is: " + (4*4));
				
			}
		};
		
		calc.addition();  			// then we are calling that methods using anonymous 
		calc.subtraction();
		calc.multiplication();
		calc.message();

	}

}

import java.util.Random;

public class BinaryNumGenerator {

	public static void main(String[] args) {
		// Set up automatic generation for a list
		String input;
		Random gen = new Random();
		int i;
		int[] binary = {0,0,0,0,0,0,0,0}; // Initial list of binary with placeholders
		int total = 0;
		
		
		for(i=0; i < binary.length; i++)
		{
			binary[i] = gen.nextInt(2); // Generates 8 numbers between 0-1
			
		}
		
		for(i=0; i < binary.length; i++)
		{
			if(binary[i]==1)
			{
				total+=Math.pow(2,7-i);
			}
			
		}
		
		//Finish Input and comparison
		
	}

}


public class random_letter {
	// page 122 a + Math.random () * b will give a random number 
	// between the values assigned to a and b.
	public static void main(String[] args) {
		int randomNumber;
		int startingNumber = 65;
		int endingNumber   = 91 - startingNumber;
		randomNumber = (int)(startingNumber + Math.random()*endingNumber);
		System.out.println(randomNumber);
		
		char letter = (char)randomNumber;
		System.out.println(letter);
		
	}

}

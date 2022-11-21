public class PigDriver{
	public static void main (String[] args) {
		PigLatin pgltn = new PigLatin(); // trying to create new object of the PigLatin class
		String ans = pgltn.translateSentence("one, two, three"); // ERROR : cannot find the symbol
		System.out.println(ans);
		
		//String ans = pgltn.translateWord("yellow"); // ERROR : cannot find the symbol 
		//if(!ans.equals("")) // the string went empty with the translate method
         //{
             //System.out.println("The Pig Latin encoded string of the string " + ans + " is possible");   
         //}
         //else
         //{
          //   System.out.println("The Pig Latin encoded string of the string " + pgltn + " is " + ans); // there's the answer
         //}
		
			
		
	}
}

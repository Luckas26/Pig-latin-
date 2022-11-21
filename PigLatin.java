import java.util.ArrayList;

public class PigLatin {
     //check vowels
     public static Boolean isVowel(char c){
		 if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||
		    c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' ||c == 'y' ||c == 'Y' )
		    //there's a vowel
		    return true;
		    //there's consonant
		    return false;
	  
		 }
	  
	public static String translateWord(String word){
		word = word.toLowerCase();// just put to lowercase 
		int length = word.length();// gives you length
		String pigLatinWord = "";// final answer
		int i;// external count
		
		for (i = 0; i < length; i++){// loop to check every char
			if(isVowel(word.charAt(i))) { //if isVowel == true, it looks for the char at the index where the count stops
				break; // going out of the loop
				}
			}
		if(i == length){ // it ain't possible, doesn't contain vowels 
			return "";
			}
			
			
			// special case is qu 
		if (word.length() > 1 && word.substring(0, 2).equals("qu")){
			pigLatinWord = word.substring(i+1); // checking where it continues after the vowels were 
			pigLatinWord += word.substring(0, i-0+1); // pig latin word will be the the word from where it continued
													  //and then plus the initial vowel
			if (i == 0){
			pigLatinWord += "way";// adding way
			}
			else pigLatinWord += "ay";// adding ay
			}
		else {	// continue the loop as vowel or consonant
		pigLatinWord = word.substring(i); // checking where it continues after the vowels were 
		pigLatinWord += word.substring(0, i-0); // pig latin word will be the the word from where it continued
												// and then plus the initial vowel
		
			
		
			
			
		if (word.length() > 1 && word.substring(0, 1).equals("y")){ // check if y is first letter
				pigLatinWord = word.substring(i+1); // checking where it continues after the vowels were, if y is first letter, 
													//it will cut one character more, which would be the y, so it will 
													//behave like consonant
			pigLatinWord += word.substring(0, i-0+1); // pig latin word will be the the word from where it continued
													  //and then plus the initial 
			if (i == 0){	// it is the first letter, therefore it would be considered as consonant
				pigLatinWord += "ay";// adding ay,  it is y considered a consonant
				}
			else {pigLatinWord += "way";// adding way, it is y considered as vowel
				}
			}
		
		
		else {
			if (i == 0){	// this means it is a vowel
			pigLatinWord += "way";// adding way
			}
		else {pigLatinWord += "ay";// adding ay,  it is a consonant
		}
			
			}
	}
	return pigLatinWord; //return the pig latin word already translated
}




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		public static String translateSentence(String sentence){
			sentence = sentence.toLowerCase();
			String pigLatinSentence = "";
			String sentenceSplit[] = sentence.split("[ \t\n,?.!\"]+");
			ArrayList<String> sentenceSplited = new ArrayList<String>();
			int i;
			
			for (i = 0; i < sentenceSplit.length; i++){
				for (int x = 0; x < 1; x++){
				sentenceSplited.add(sentenceSplit[i]);
					
					  
				  for (i = 0; i < sentenceSplit.length; i++){
					  System.out.print(translateWord(sentenceSplit[i]) + " ");
					  }
						}
					
					}
					
					
					return sentence;
				}
					
			}

	   

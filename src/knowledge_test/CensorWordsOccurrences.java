package knowledge_test;


import static java.awt.SystemColor.text;


public class CensorWordsOccurrences  {
    public static void main(String args[]){
String description = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
String textToBeCounted = "cat";

// Split description using "words we are giving to count", which will return 
//string array of words other than cat,large,dog
String[] words = description.split("dog");

// Get number of characters words other than "cat,large"
int lengthOfNonMatchingWords = 0;
for (String word : words) {
    lengthOfNonMatchingWords += word.length();
}

// Following code gets length of `description` - length of all non-matching
// words and divide it by length of word to be counted
System.out.println("Number of words are: " + 
(description.length() - lengthOfNonMatchingWords) / textToBeCounted.length());
    }
    
    
    
    
}

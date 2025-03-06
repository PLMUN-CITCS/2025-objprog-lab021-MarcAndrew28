import java.util.Scanner;
public class WordCounter{
    public static void main(String[] args){
        countWords();
    }
    public static String getSentenceInput(){
     Scanner cram = new Scanner (System.in);

        System.out.print("Enter a Sentence: ");
        String marc = cram.nextLine();
        cram.close();
        return marc;
    }
    public static void countWords(){

      String marc = getSentenceInput();

      String[] word = marc.trim().split("\\s+");

      int count = word.length;


      System.out.print("The sentence has "+count+" words");

    }



}
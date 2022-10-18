import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
public class wordCount {

    public static void main(String[]args) throws FileNotFoundException {
        WordProcessing wordProcessing = new WordProcessing("int.txt"); 
         TreeMap<String, Integer> map = wordProcessing.getWordCount();
         for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry); 
         }

        
    } 
}


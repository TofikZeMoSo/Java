

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.File;
import java.util.Map;
import java.io.FileNotFoundException;

public class OccuranceCount {

    public static void main(String [] args) {
        Scanner filesScanner;
        PrintWriter fileWriter;
 //       System.out.println("Tofik");

        try{
            HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
            filesScanner = new Scanner(new File("C:\\Users\\Tofik Maniyar\\ZeMoSo\\Java\\Assignment11\\src\\Assign.txt"));

            while(filesScanner.hasNext()) {
                char[] charArray = filesScanner.next().toCharArray();

                for(char ch : charArray) {
                    if(charCount.containsKey(ch)) {
                        charCount.put(ch, charCount.get(ch) + 1);
                    }
                    else {
                        charCount.put(ch,1);
                    }
                }
            }
            fileWriter = new PrintWriter("Assign.txt");
            for (Map.Entry<Character,Integer> entry : charCount.entrySet())
            {
                fileWriter.println(entry.getKey() +":"+ entry.getValue());
            }
            filesScanner.close();
            fileWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

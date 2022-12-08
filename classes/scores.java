package scores;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class scores {
  public static void writeFile(String str) {
    try {
      // Create a new file and a BufferedWriter to write to it
      FileWriter fw = new FileWriter("scores.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);

      // Write the string to the file
      bw.write(str);

      // Close the writer to save the file
      bw.close();
    } catch (IOException e) {
      // Handle any errors that may have occurred
      e.printStackTrace();
    }
  }

  public static void readFile(){
    try {
      // Create a new FileReader and a BufferedReader to read from the file
      FileReader fr = new FileReader("scores.txt");
      BufferedReader br = new BufferedReader(fr);

      // Read and print each line from the file
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }

      // Close the reader to release the file
      br.close();
    } catch (IOException e) {
      // Handle any errors that may have occurred
      e.printStackTrace();
    }
  }
}
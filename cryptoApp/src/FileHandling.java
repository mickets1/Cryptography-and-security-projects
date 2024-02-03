import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
  public String readFile(String fileName) {
    try {
      Scanner file = new Scanner(new File(parsefilePath(fileName)), "utf-8");

      StringBuilder str = new StringBuilder();

      while (file.hasNextLine()) {
        str.append(file.nextLine());
      }

      return str.toString();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return null;
  }

  private String parsefilePath (String fileName) {
    return System.getProperty("user.dir") + "/" + fileName;
  }

  public void writeFile (String cipherText, String filename) {
    try {
      Writer wr = new FileWriter(parsefilePath(filename));

      wr.write(cipherText);

      wr.flush();
      wr.close();
      System.out.println("\nFile written to " + filename);
      
      return;
  } catch (Exception e) {
  e.printStackTrace();
    }
  }
}

import java.io.FileReader;
import java.io.IOException;
// url deprecated so added uri :(
import java.net.URI;
import java.net.URL;

public class ReadCSV {
  public static void main(String[] args) {
    String temploki = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    try {
      // ????????
      URL url = Path.get(temploki).toURI().toURL();

      FileReader file = new FileReader(temploki);

      file.close();
    } catch (IOException e) {
      System.out.print("");
    } finally {

    }
  }
}



//Check if a String Array contains a certain value “A”.
import java.util.Arrays;

public class string1 {

  public static void main(String[] args) {

    String[] alphabet = new String[] { "A", "B", "C" };

    // Convert to stream
    boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
    if (result)
      System.out.println("Hello A");
    else
      System.out.println("No Match Found");
  }

}

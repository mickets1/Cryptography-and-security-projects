import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TestHash {
  private HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

  public String doUniformityTest (ArrayList<Integer> hashValues) {
      for (Integer integer : hashValues) {
      Integer elem = hmap.get(integer);

      // Element don't exist
      if (hmap.get(integer) == null) {
        hmap.put(integer, 1);
      // Element exists
      } else {
        hmap.put(integer, ++elem);
    }
  }
  return hmap.toString();
}

  public String generateRandomString () {
    StringBuilder sb = new StringBuilder();
    final String alpha = "abcdefghijklmnopqrstuvwxyz";
    Random rnd = new Random();

    while (sb.length() < rnd.nextInt(50 - 5 + 1) + 5) {
      int index =  (int) (rnd.nextFloat() * alpha.length());
      sb.append(alpha.charAt(index));
    }

    return sb.toString();
  }

  public ArrayList<String> generateSimilarString (int iterations) {
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    char[] c = alpha.toCharArray();
    ArrayList<String> similarStrings = new ArrayList<>();
    StringBuilder sb = new StringBuilder(alpha);
    Random rnd = new Random();
    
    while (similarStrings.size() != iterations) {
      int rndIndex = rnd.nextInt(sb.toString().length());
      
      sb.setCharAt(rnd.nextInt(sb.toString().length()), c[rndIndex]);

      if (!similarStrings.contains(sb.toString())) {
        similarStrings.add(sb.toString());
      }
    }
    return similarStrings;
  }
}

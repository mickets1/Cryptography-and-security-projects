import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> hashValues = new ArrayList<>();
        PearsonHash hash = new PearsonHash();
        TestHash test = new TestHash();

        // Generates a random string for input and a hash from the input.
        for (int i = 0; i < 2000; i++) {
          String rndString = test.generateRandomString();
          hashValues.add(hash.doHash(rndString));   
        }
        System.out.println(test.doUniformityTest(hashValues));

        System.out.println("\n + -------------------------------- +\n");

        // Generates a list of similar strings and compare uniformity.
        ArrayList<String> similarString = test.generateSimilarString(2000);
        for (int i = 0; i < similarString.size(); i++) {
          hashValues.add(hash.doHash(similarString.get(i))); 
        }
        
        
        System.out.println(test.doUniformityTest(hashValues));
    }
}

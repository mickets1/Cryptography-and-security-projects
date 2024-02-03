import java.util.ArrayList;
import java.util.Collections;

public class PearsonHash {
  public int doHash(String inputString) {
    byte[] byteArray = shuffleArray();
    
    byte[] input = inputString.getBytes();

    int hash = 0;
    for (byte b : input) {
      hash = Byte.toUnsignedInt(byteArray[(hash ^ b)]);
    }

    return hash;
  }

  private byte[] shuffleArray () {
    ArrayList<Byte> b = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      b.add((byte) i);
    }

    Collections.shuffle(b);

    byte[] byteArray = new byte[b.size()];
    for (int i = 0; i < b.size(); i++) {
      byteArray[i] = (byte) b.get(i);
    }
    
    return byteArray;
  }
}

public class CaesarCipher {
  
  public String encrypt(String plainText, int offset) {
    StringBuilder encrypedResult = new StringBuilder();

    final String alpha = "abcdefghijklmnopqrstuvwxyz";
    int alphaLength = alpha.length();

    offset = offset % alphaLength;

    // Handles offset over 26 and below 0(decryption).
    if (offset > alphaLength) {                                                                                                         
      offset = offset % alphaLength;                                                                                                   
    } else if (offset < 0) {                                                                                                   
      offset = (offset % alphaLength) + alphaLength;                                                                                            
    }      

    for (int i = 0; i < plainText.length(); i++) {
      char currentChar = plainText.charAt(i);

      if (!Character.isLetter(currentChar)) {
        encrypedResult.append(currentChar);
        continue;
      }

      char encChar = validateCase(currentChar, offset, alphaLength);
      encrypedResult.append(encChar);
    }

    return encrypedResult.toString();
  }

  private char validateCase (char currentChar, int offset, int alphaLength) {
    char c = (char) (currentChar + offset);

    if (Character.isUpperCase(currentChar)) {
      if (c > 'Z') {
        return (char) (c - alphaLength);
      } else {
        return c;
      }
    } else {
      if (c > 'z') {
        return (char) (c - alphaLength);
      } else {
        return c;
      }
    }
  }

  public String decrypt (String cipherText, int offset) {
    offset = -offset;
    return encrypt(cipherText, offset);
  }

  public void crackCaesarCipher () {
    FileHandling fh = new FileHandling();
    String cipherText = fh.readFile("OtherStudentCipher.txt");
    String name = "Mia-Maria Galistel".toLowerCase();

    for (int i = 0; i < 256; i++) {
      String plainText = decrypt(cipherText, i);
      boolean hasFlag = plainText.toLowerCase().contains(name);

      if (hasFlag) {
        System.out.println(plainText);
        break;
      }
    }
  }
}

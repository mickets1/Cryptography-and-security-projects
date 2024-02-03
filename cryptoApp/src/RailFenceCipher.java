public class RailFenceCipher {
  public String encrypt (String plainText, int secretKey) {
    StringBuilder encrypedResult = new StringBuilder();

    boolean moveDown = false;
    int j = 0;
    int row = secretKey;
    int col = plainText.length();
    char[][] table = new char[row][col];

    for (int i = 0; i < col; i++) {
      if (j == 0 || j == secretKey - 1) {
        moveDown = !moveDown;
      }

      table[j][i] = plainText.charAt(i);

      if (moveDown) {
        j++;
      } else {
        j--;
      }
    }

    for (int i = 0; i < row; i++) {
      for (int k = 0; k < col; k++) {
        if (table[i][k] != 0) {
          encrypedResult.append(table[i][k]);
        }    
      }
    }

    return encrypedResult.toString();
  }

  public String decrypt (String plainText, int secretKey) {
    StringBuilder decrypedResult = new StringBuilder();

    boolean moveDown = false;
    int j = 0;
    int row = secretKey;
    int col = plainText.length();
    char[][] table = new char[row][col];

    for (int i = 0; i < col; i++) {
      if (j == 0 || j == secretKey - 1) {
        moveDown = !moveDown;
      }

      table[j][i] = '*';

      if (moveDown) {
        j++;
      } else {
        j--;
      }
    }

    int index = 0;
    moveDown = false;
    for (int i = 0; i < row; i++) {
      for (int k = 0; k < col; k++) {
        if (table[i][k] == '*' && index < col) {
          table[i][k] = plainText.charAt(index++);
        }    
      }
    }

    j = 0;
    for (int i = 0; i < col; i++) {
      if (j == 0 || j == secretKey - 1) {
        moveDown = !moveDown;
      }

      decrypedResult.append(table[j][i]);

      if (moveDown) {
        j++;
      } else {
        j--;
      }
    }

    return decrypedResult.toString();
  }
}

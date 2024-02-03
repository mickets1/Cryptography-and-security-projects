import java.util.Scanner;

public class ConsoleUi {
  Scanner input = new Scanner(System.in);
  FileHandling fh = new FileHandling();

  
  public void mainMenu () {
    while (doEncryption()) {
    }
    closeScanner();
  }


  public int encryptionMethodPrompt () {
    System.out.println("\n1. Caesar Cipher");
    System.out.println("2. Rail Fence Cipher.");
    System.out.println("3. Exit");
    System.out.print("Select encryption method: ");
    
    return input.nextInt();
  }

  public int encryptionDecryptionPrompt () {
    System.out.println("\n1. Encryption");
    System.out.println("2. Decryption");
    System.out.println("3. Exit");
    System.out.print("Do you want to encrypt or decrypt a message?: ");

    return input.nextInt();
  }

  public boolean doEncryption () {
    int methodSelection = encryptionMethodPrompt();
    int encDecSelection = encryptionDecryptionPrompt();

    if (methodSelection == 3 || encDecSelection == 3) {
      return false;
    }
    
    System.out.print("Type the filename: ");
    String plainText = fh.readFile(input.next());

    if (methodSelection == 1) {
      CaesarCipher cc = new CaesarCipher();

      System.out.print("Type the secret key for the Caesar cipher(int): ");
      int secretKey = input.nextInt();

      if (encDecSelection == 1) {
        String cipherText = cc.encrypt(plainText, secretKey);
        fh.writeFile(cipherText, "ciphertext.txt");
      } else {
        String cipherText = fh.readFile("ciphertext.txt");
        String pText = cc.decrypt(cipherText, secretKey);
        fh.writeFile(pText, "plaintext.txt");
      } 
    } else if (methodSelection == 2) {
      RailFenceCipher rf = new RailFenceCipher();

      System.out.print("Type the secret key for the Rail Fence Cipher(int): ");
      int secretKey = input.nextInt();

      if (encDecSelection == 1) {
        String cipherText = rf.encrypt(plainText, secretKey);
        fh.writeFile(cipherText, "ciphertext.txt");
      } else {
        String cipherText = fh.readFile("ciphertext.txt");
        String pText = rf.decrypt(cipherText, secretKey);
        fh.writeFile(pText, "plaintext.txt");
      }
    }
    return true;
  }

  public void closeScanner () {
    input.close();
  }
}

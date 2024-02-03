# Experiment of encryption and decryption of Caesar and Rail Rence cipher.

CaesarCipher Class

The CaesarCipher class provides a simple implementation of the Caesar cipher algorithm. This class includes methods for encrypting and decrypting messages using a specified offset. The primary functionalities are:

    Encryption: The encrypt method takes a plain text message and an offset, then returns the encrypted message.

    Decryption: The decrypt method takes a cipher text message and an offset, then returns the decrypted message.

    Cipher Breaking: The crackCaesarCipher method attempts to break a Caesar cipher by brute force, searching for the correct offset to decrypt a given cipher text. This is particularly useful for cases where the offset is unknown.

RailFenceCipher Class

The RailFenceCipher class implements the Rail Fence cipher algorithm. This class includes methods for encrypting and decrypting messages using a specified secret key. Key features of this class are:

    Encryption: The encrypt method takes a plain text message and a secret key, then returns the encrypted message using the Rail Fence technique.

    Decryption: The decrypt method takes a cipher text message and a secret key, then returns the decrypted message.

FileHandling Class

The FileHandling class is a utility class providing methods for reading and writing files. Key functionalities include:

    Read File: The readFile method reads the content of a specified file and returns it as a string.

    Write File: The writeFile method writes the provided cipher text to a specified file.

Usage

To use these classes, create an instance of the desired cipher class and call the relevant methods with the appropriate parameters. Additionally, the FileHandling class can be used to handle file input and output for your cipher operations.

Note: Ensure that the necessary file paths are correctly provided when using the file handling functionalities.
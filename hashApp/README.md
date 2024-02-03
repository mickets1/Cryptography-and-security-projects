# Experiment creating a simple hash algorithm

    Random String Testing: The main method generates a list of 2000 random strings, calculates their Pearson hash values, and performs a uniformity test using the TestHash class.

    Similar String Testing: The main method generates a list of 2000 similar strings, calculates their Pearson hash values, and performs another uniformity test using the TestHash class.

PearsonHash Class

The PearsonHash class implements the Pearson hashing algorithm. Key functionalities include:

    Hash Calculation: The doHash method calculates the Pearson hash for a given input string.

    Array Shuffling: The shuffleArray method shuffles an array of bytes to be used in the hash calculation.

TestHash Class

The TestHash class provides functionalities for testing the uniformity of hash values. Key features include:

    Uniformity Testing: The doUniformityTest method performs a uniformity test on a list of hash values, counting the occurrences of each hash value.

    Random String Generation: The generateRandomString method generates a random string of variable length.

    Similar String Generation: The generateSimilarString method generates a list of similar strings by randomly changing characters in the original string.

Usage

To utilize the application, create instances of the PearsonHash and TestHash classes, and use them as demonstrated in the App class. Adjust the number of iterations and other parameters based on your testing requirements.

Note: The App class showcases the usage of Pearson hashing and uniformity testing for both random and similar strings. Adjust the code accordingly for your specific use case.

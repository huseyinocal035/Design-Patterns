package AdapterPattern;

public class AES implements Cryption {
    @Override
    public void encrypt(String data) {
        System.out.println(data + " is encrypting with AES");
    }

    @Override
    public void decrypt(String data) {
        System.out.println(data + " is decrypting with AES");
    }
}

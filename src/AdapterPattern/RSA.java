package AdapterPattern;

public class RSA implements Cryption {
    @Override
    public void encrypt(String data) {
        System.out.println(data + " is encrypting with RSA");
    }

    @Override
    public void decrypt(String data) {
        System.out.println(data + " is decrypting with RSA");
    }
}

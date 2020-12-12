package AdapterPattern;

public class Main {

    public static void main(String[] args) {

        Cryption aes = new AES();
        aes.encrypt("AES data");
        aes.decrypt("Encrypted AES data");

        System.out.println();

        Cryption rsa = new RSA();
        rsa.encrypt("RSA data");
        rsa.decrypt("Encrypted RSA data");

        System.out.println();

        Cryption codeData = new CodeAdapter(new CodeData());
        codeData.encrypt("CodeData data");
        codeData.decrypt("Encoded CodeData data ");
    }
}

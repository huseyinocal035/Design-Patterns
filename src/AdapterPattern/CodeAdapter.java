package AdapterPattern;

public class CodeAdapter implements Cryption {

    private CodeData codeData;

    public CodeAdapter(CodeData codeData) {
        this.codeData = codeData;
    }

    @Override
    public void encrypt(String data) {
        codeData.encode(data);
    }

    @Override
    public void decrypt(String data) {
        codeData.decode(data);
    }
}

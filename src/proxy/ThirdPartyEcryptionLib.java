package proxy;

public interface ThirdPartyEcryptionLib {
    public void performSaveTempOperation(String nameCipher, String keyInputField, String privateKeyInputField, String encryptInput, String decryptInput);
}
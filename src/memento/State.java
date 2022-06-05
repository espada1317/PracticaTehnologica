package memento;

import ciphers.CipherClass;

public class State {
    private int stateID;
    private CipherClass cipherName;
    private String publicKey;
    private String privateKey;
    private String encryptInput;
    private String decryptInput;

    public State(int stateID) {
        super();
        this.stateID = stateID;
    }

    public int getStateID() {
        return  stateID;
    }

    public CipherClass getCipherName() {
        return cipherName;
    }

    public State setCipherName(CipherClass cipherName) {
        this.cipherName = cipherName;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public State setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public State setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getEncryptInput() {
        return encryptInput;
    }

    public State setEncryptInput(String encryptInput) {
        this.encryptInput = encryptInput;
        return this;
    }

    public String getDecryptInput() {
        return decryptInput;
    }

    public State setDecryptInput(String decryptInput) {
        this.decryptInput = decryptInput;
        return this;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateID=" + stateID +
                ", cipherName=" + cipherName +
                ", publicKey='" + publicKey + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", encryptInput='" + encryptInput + '\'' +
                ", decryptInput='" + decryptInput + '\'' +
                '}';
    }

    public Memento createMemento() {
        return new Memento(stateID, cipherName, publicKey, privateKey, encryptInput, decryptInput);
    }

    public void restore(Memento memento) {
        if (memento != null) {
            this.stateID = memento.getStateID();
            this.cipherName = memento.getCipherName();
            this.publicKey = memento.getPublicKey();
            this.privateKey = memento.getPrivateKey();
            this.encryptInput = memento.getEncryptInput();
            this.decryptInput = memento.getDecryptInput();
        } else {
            System.err.println("Can't restore without memento object!");
        }
    }
}
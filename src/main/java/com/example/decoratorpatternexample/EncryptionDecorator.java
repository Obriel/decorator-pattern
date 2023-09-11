package com.example.decoratorpatternexample;

// Concrete decorator implementation
class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();
        return decrypt(encryptedData);
    }

    private String encrypt(String data) {
        // Encrypt data
        System.out.println("Encrypting data");
        return "Encrypted data";
    }

    private String decrypt(String data) {
        // Decrypt data
        System.out.println("Decrypting data");
        return "Decrypted data";
    }
}

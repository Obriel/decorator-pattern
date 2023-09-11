package com.example.decoratorpatternexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorPatternExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternExampleApplication.class, args);

		// Create a plain data source
		DataSource dataSource = new FileDataSource("data.txt");

		dataSource.writeData("New data source");
		dataSource.readData();

		System.out.println("----------------------------");

		// Wrap the data source with encryption decorator
		DataSource encryptedDataSource = new EncryptionDecorator(dataSource);

		// Write data using the encrypted data source
		encryptedDataSource.writeData("Hello, World!");

		System.out.println("----------------------------");

		// Read data using the encrypted data source
		String decryptedData = encryptedDataSource.readData();
		System.out.println("Decrypted data: " + decryptedData);
	}

}

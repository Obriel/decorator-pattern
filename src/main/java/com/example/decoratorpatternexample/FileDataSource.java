package com.example.decoratorpatternexample;

// Concrete component implementation
class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        // Write data to file
        System.out.println("Writing data to file: " + data);
    }

    @Override
    public String readData() {
        // Read data from file
        System.out.println("Reading data from file");
        return "Data from file";
    }
}

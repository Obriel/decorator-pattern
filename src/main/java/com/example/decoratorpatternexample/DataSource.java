package com.example.decoratorpatternexample;

// Component interface
interface DataSource {
    void writeData(String data);
    String readData();
}

package org.example;

public class startTest {

    public static void main(String[] args) {


        String jsonString = "{\"type\": \"data\", \"name\": \"John\"}";

        // Create a JSONObject from the JSON string


        // Get the JSON string representation


        // Split the JSON string into lines
        String[] lines = jsonString.split("\\r?\\n");

        // Check if every line starts with a double quote
        boolean allLinesStartWithDoubleQuote = true;
        for (String line : lines) {
            if (!line.trim().startsWith("\"")) {
                allLinesStartWithDoubleQuote = false;
                break;
            }
        }

        if (allLinesStartWithDoubleQuote) {
            System.out.println("Every line starts with a double quote");
        } else {
            System.out.println("Not every line starts with a double quote");
        }
    }
}


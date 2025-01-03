package aspireTest;

import java.io.*;
import java.util.Properties;

public class PropertyFile {

    public static void main(String[] args) {
        // File name for the property file
        String fileName = "config.properties";

        // Create a Properties object
        Properties properties = new Properties();

        // Write to the property file
        try (OutputStream output = new FileOutputStream(fileName)) {
            // Set key-value pairs
            properties.setProperty("database", "localhost");
            properties.setProperty("username", "admin");
            properties.setProperty("password", "password123");

            // Save properties to the file
            properties.store(output, "Configuration Properties");
            System.out.println("Properties file created successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to the property file: " + e.getMessage());
        }

        // Read from the property file
        try (InputStream input = new FileInputStream(fileName)) {
            // Load properties from the file
            properties.load(input);

            // Access properties using keys
            String database = properties.getProperty("database");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // Print properties
            System.out.println("Database: " + database);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            System.out.println("Error while reading from the property file: " + e.getMessage());
        }

        // Update the property file
        try (OutputStream output = new FileOutputStream(fileName)) {
            // Update a property
            properties.setProperty("password", "newPassword456");

            // Save updated properties back to the file
            properties.store(output, "Updated Configuration Properties");
            System.out.println("Properties file updated successfully.");
        } catch (IOException e) {
            System.out.println("Error while updating the property file: " + e.getMessage());
        }
    }
}

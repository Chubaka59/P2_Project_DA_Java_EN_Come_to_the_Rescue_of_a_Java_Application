package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Export a symptoms map in a file.
 *
 */
public class WriteSymptomDataToFileImpl implements SymptomWriter {

    private final String filepath;

    /**
     * @param filepath path for the output file.
     *                 null parameters will be thrown
     */
    public WriteSymptomDataToFileImpl(String filepath) {
        if (filepath == null || filepath.isEmpty() || filepath.isBlank()){
            throw new IllegalArgumentException("File path is null");
        }

        this.filepath = filepath.trim();
    }

    @Override
    public void exportResults(Map<String, Integer> map) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


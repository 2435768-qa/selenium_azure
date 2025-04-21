package org.example.ui.utils;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class FileUtils {

    public static <T> List<T> convertToModel(String filePath, Class<T> modelType) {
        try (Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            return new CsvToBeanBuilder<T>(reader)
                    .withType(modelType)
                    .build()
                    .parse();
        } catch (IOException | IllegalStateException ex) {
            throw new IllegalArgumentException("Error processing the CSV file: " + ex.getMessage(), ex);
        }
    }
}

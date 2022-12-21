package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Export a symptoms map in a file.
 *
 */
public interface SymptomWriter {
    void exportResults(Map<String, Integer> map);
}
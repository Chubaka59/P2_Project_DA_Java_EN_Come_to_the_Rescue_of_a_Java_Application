package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Convert symptoms from a List to a Map.
 * Duplicated entries will be removed and will increment the Value of the attached Key
 *
 */
public interface SymptomListToMapConverter {
    /**
     *
     * @return a map of all symptoms sorted by alphabetical order
     */
    Map<String, Integer> compute(List<String> symptomsList);
}

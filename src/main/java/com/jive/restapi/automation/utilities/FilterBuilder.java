package com.jive.restapi.automation.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterBuilder {
    private Map<String, String> map = new HashMap<>();

    public static String searchFilter(Map<String, String> conditions) {
        return String.join(",", searchFilterList(conditions));
    }

    public static List<String> searchFilterList(Map<String, String> conditions) {
        return conditions.entrySet().stream().
                map(
                        e ->  e.getValue() != null ? e.getKey() + "(" + e.getValue() + ")" : e.getKey()
                ).collect(Collectors.toList()
        );
    }

    public FilterBuilder addCondition(String name, String value) {
        map.put(name, value);
        return this;
    }

    public String build() {
        return searchFilter(map);
    }

    public String[] buildList() {
        return searchFilterList(map).toArray(new String[0]);
    }

    public static FilterBuilder builder() {
        return new FilterBuilder();
    }
}

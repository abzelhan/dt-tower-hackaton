package com.ama.tower.component;

import com.ama.tower.dto.Word;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class WordParser {

    private final ObjectMapper objectMapper;

    @Value("classpath:data.json")
    Resource resourceFile;

    @SneakyThrows
    public List<String> getWords() {
        final Scanner scanner = new Scanner(resourceFile.getFile());
        StringBuilder jsonString = new StringBuilder();
        while (scanner.hasNextLine()) {
            jsonString.append(scanner.nextLine());
        }
        TypeReference<HashMap<String, Word>> responseType =
                new TypeReference<HashMap<String, Word>>() {};

        return objectMapper.readValue(resourceFile.getFile(), responseType)
                .entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }
}

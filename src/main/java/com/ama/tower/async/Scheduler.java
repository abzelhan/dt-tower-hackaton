package com.ama.tower.async;

import com.ama.tower.dto.TestClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class Scheduler {
    private final ObjectMapper objectMapper;
    private final RestTemplate restTemplate;

    @SneakyThrows
    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask() {
        log.info("Fixed delay task - " + System.currentTimeMillis() / 1000);
        final String serializedObj = objectMapper.writeValueAsString(TestClass.builder().title(null).createdAt(LocalDateTime.now()));
        final TestClass testClass = objectMapper.readValue(serializedObj, TestClass.class);
    }
}

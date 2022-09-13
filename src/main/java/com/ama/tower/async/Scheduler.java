package com.ama.tower.async;

import com.ama.tower.dto.TestClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class Scheduler {

    private final ObjectMapper objectMapper;

    @SneakyThrows
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        log.info("Fixed delay task - " + System.currentTimeMillis() / 1000);
        final String serializedObj = objectMapper.writeValueAsString(TestClass.builder().title(null).createdAt(LocalDateTime.now()));
        final TestClass testClass = objectMapper.readValue(serializedObj, TestClass.class);
    }
}

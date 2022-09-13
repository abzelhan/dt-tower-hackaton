package com.ama.tower.async;

import com.ama.tower.component.WordParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class Scheduler {
    private final WordParser wordParser;

    @SneakyThrows
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        log.info("Fixed delay task - " + System.currentTimeMillis() / 1000);
        final List<String> words = wordParser.getWords();
        log.info("Fixed delay task - " + System.currentTimeMillis() / 1000);

    }
}

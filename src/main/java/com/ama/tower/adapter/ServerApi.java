package com.ama.tower.adapter;

import com.ama.tower.model.Tower;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ServerApi {

    private static final String towerId = "PH3YFpCeF0mm5zyUxEWwLcxRPMBtHVQ9cP9LuM/zWcj3w2iaILWg/UMng7EYorYpSDc=";
    private final RestTemplate restTemplate;

    public void createTower(Tower tower) {
        TowerCreate towerCreate = TowerCreate.builder()
                .towerId(towerId)
                .letters(tower.getLetters())
                .build();
        HttpEntity<TowerCreate> request = new HttpEntity<>(towerCreate);
        restTemplate.postForObject("https://dtower-api.datsteam.dev/towers", request, TowerCreate.class);
    }
}

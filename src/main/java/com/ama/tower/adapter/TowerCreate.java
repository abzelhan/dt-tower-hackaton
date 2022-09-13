package com.ama.tower.adapter;

import com.ama.tower.model.Cube;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TowerCreate {
    String towerId;
    List<Cube> letters;
}

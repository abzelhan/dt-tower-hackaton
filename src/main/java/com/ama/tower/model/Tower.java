package com.ama.tower.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tower {
    List<Cube> letters;
}

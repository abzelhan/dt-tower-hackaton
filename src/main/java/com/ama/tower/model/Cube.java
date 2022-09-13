package com.ama.tower.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Value
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cube {
    String letter;
    Long x;
    Long y;
    Long z;
}

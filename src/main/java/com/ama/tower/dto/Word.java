package com.ama.tower.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Word {
    String definition;
    String answerNeedToIncludePlural;
    String answerIsProbablyNotNoun;
}

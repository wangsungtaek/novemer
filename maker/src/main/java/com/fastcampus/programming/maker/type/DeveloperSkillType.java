package com.fastcampus.programming.maker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END("백엔드 개발자"),
    FRONT_END("프론트앤드 개발자"),
    FULL_END("풀스텍 개발자")
    ;

    private final String description;
}

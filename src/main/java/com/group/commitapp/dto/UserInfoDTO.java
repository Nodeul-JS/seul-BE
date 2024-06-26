package com.group.commitapp.dto;

import com.group.commitapp.domain.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserInfoDTO {
    @Schema(description = "유저의 githubID")
    private String githubId;
    @Schema(description = "유저 레벨")
    private Integer level;
    @Schema(description = "유저 경험치")
    private Integer experience;
    public UserInfoDTO(User user){
        this.githubId = user.getGithubId();
        this.level = user.getLevel();
        this.experience = user.getExperience();
    }
}

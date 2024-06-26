package com.group.commitapp.dto.badge;

import com.group.commitapp.domain.Badge;
import com.group.commitapp.domain.BadgeHistory;
import jakarta.persistence.Lob;
import lombok.Getter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@Data
@Schema(description = "획득한 뱃지 리스트 출력 DTO -> [badgeName,\n" +
        "descrip,\n" +
        "createdAt]")
@Getter
public class findBadgeListDTO {
    public findBadgeListDTO(Badge badge, BadgeHistory badgeHistory) {
        this.badgeId = badge.getBadgeId();
        this.badgeName = badge.getName();
        this.description = badge.getDescription();
        this.createdAt = badgeHistory.getCreatedAt().toString();
    }

    @Schema(description = "뱃지 ID")
    private Long badgeId;
    @Schema(description = "뱃지 이름")
    private String badgeName;


    @Schema(description = "뱃지 설명")
    private String description;

    @Schema(description = "뱃지 획득 날짜")
    private String createdAt;
}

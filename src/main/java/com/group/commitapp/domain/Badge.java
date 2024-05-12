package com.group.commitapp.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "badge")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;
    private String name;
    private String description;


}

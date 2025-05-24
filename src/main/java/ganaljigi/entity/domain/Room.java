package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Room {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String number; // 호수

    @Column(nullable = false)
    private String name; // 호실명

    @Column(nullable = false)
    private String floor; // 층

    @Column(nullable = false)
    private boolean lecture; // 수업여부

    @Column(nullable = false)
    private int capacity; // 수용인원

    @Column(nullable = false)
    private float floorSpace; // 평수

    @Column(nullable = false)
    private float area; // 면적

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoomType roomType; // 호실형태

    @Column(nullable = false)
    private String department; // 관리부서

    @Column(nullable = false)
    private String departmentNumber; // 관리부서 전화번호

    private String comment; // 특이사항

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_info_id")
    private RoomInfo roomInfo;

    @OneToMany(mappedBy = "room")
    private List<RoomImage> images = new ArrayList<>();
}

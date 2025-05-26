package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Door {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "door_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    private boolean wheelchair; // 휠체어 진입 가능 여부

    private String significant; // 특이사항

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    @OneToMany(mappedBy = "door", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DoorImage> doorImages = new ArrayList<>();
}

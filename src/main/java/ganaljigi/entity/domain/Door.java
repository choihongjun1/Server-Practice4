package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
public class Door {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "door_id", nullable = false)
    private int id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    private String image; // 사진

    @Column(nullable = false)
    private boolean wheelChair; // 휠체어 진입 가능 여부

    private String significant; // 특이사항

    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
}

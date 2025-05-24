package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
public class Obstacle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "obstacle_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ObstacleType type; // 타입
}

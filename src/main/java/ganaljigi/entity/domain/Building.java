package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
public class Building {

    @Id @GeneratedValue
    @Column(name = "building_id", nullable = false)
    private int id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    private String name; // 건물이름

    private int number; // 건물번호
    private String department; // 소속부서
}

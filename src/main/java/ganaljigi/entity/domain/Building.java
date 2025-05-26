package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Building {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    private String name; // 건물이름

    @Column(nullable = false)
    private String image; // 건물사진

    private int number; // 건물번호
    private String department; // 소속부서

    @OneToMany(mappedBy = "building")
    private List<Door> doors = new ArrayList<>();

    @OneToMany(mappedBy = "building")
    private List<Room> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "building")
    private List<Significant> significant = new ArrayList<>();

    @OneToMany(mappedBy = "building")
    private List<Facilities> facilities = new ArrayList<>();
}

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
public class OutsideSignificant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outside_significant_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Point spot; // 위치

    @Column(nullable = false)
    private String description; // 설명

    @OneToMany(mappedBy = "significant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OutsideSignificantImage> images = new ArrayList<>();
}

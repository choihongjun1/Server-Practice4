package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.KeySelector;

@Entity
@Getter
@Setter
public class Facilities {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facilities_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name; // 이름

    @Column(nullable = false)
    private String floor; // 층

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FacilitiesType purpose; // 용도

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
}

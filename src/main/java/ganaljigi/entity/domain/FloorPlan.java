package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FloorPlan {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "floor_plan_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String image; // 도면 사진

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

}

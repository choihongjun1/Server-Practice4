package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Significant {

    @Id @GeneratedValue
    @Column(name = "significant_id", nullable = false)
    private Long id;

    private String description; // 설명

    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
}

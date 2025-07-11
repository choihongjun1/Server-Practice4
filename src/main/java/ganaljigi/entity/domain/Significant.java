package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Significant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "significant_id", nullable = false)
    private Long id;

    private String description; // 설명

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    @OneToMany(mappedBy = "significant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SignificantImage> images = new ArrayList<>();
}

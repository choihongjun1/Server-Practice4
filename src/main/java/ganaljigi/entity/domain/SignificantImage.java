package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SignificantImage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "significant_image_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String url; // 사진 url

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "significant_id", nullable = false)
    private Significant significant;
}

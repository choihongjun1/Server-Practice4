package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SignificantImage {

    @Id @GeneratedValue
    @Column(name = "significant_image_id", nullable = false)
    private Long id;

    private String url; // 사진 url

    @ManyToOne
    @JoinColumn(name = "significant_id", nullable = false)
    private Significant significant;
}

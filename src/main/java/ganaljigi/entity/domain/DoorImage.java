package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DoorImage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "door_image_id")
    private Long id;

    @Column(nullable = false)
    private String url; // 사진 url

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "door_id", nullable = false)
    private Door door;
}

package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String url; // 이미지 url

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ImageType type; // 이미지 타입

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}

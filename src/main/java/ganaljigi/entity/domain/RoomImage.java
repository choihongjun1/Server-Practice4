package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RoomImage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_image_id", nullable = false)
    private Long id;

    private String url; // 이미지 url

    @Enumerated(EnumType.STRING)
    private ImageType type; // 이미지 타입

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}

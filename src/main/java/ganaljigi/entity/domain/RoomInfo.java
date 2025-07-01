package ganaljigi.entity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RoomInfo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_info_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private boolean allInOne; // 일체형

    @Column(nullable = false)
    private boolean cinemaSeat; // 영화관

    @Column(nullable = false)
    private boolean oneSeat; // 1인용

    @Column(nullable = false)
    private boolean twoSeat; // 2인용

    @Column(nullable = false)
    private boolean multiSeat; // 다인용

    @Column(nullable = false)
    private boolean panel; // 다리 가리개

    @Column(nullable = false)
    private boolean backOfChair; // 등받이

    @Column(nullable = false)
    private boolean wheelchairTable; // 휠체어용 책상

    @Column(nullable = false)
    private boolean computerTable; // 컴퓨터 책상

    @Column(nullable = false)
    private boolean wheelChair; // 바퀴의자

    @Column(nullable = false)
    private boolean frontDoor; // 앞문

    @Column(nullable = false)
    private boolean backDoor; // 뒷문

    @OneToOne(mappedBy = "roomInfo")
    private Room room;
}

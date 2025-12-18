import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VerificationLog{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn
    private Certificate certificate;

    @Column(nullable = false)
    private LocalDateTime verifiedAt;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String ipAddress;

    @PrePersist
    protected void onCreate() {
        this.verifiedAt = LocalDateTime.now();
    }
}
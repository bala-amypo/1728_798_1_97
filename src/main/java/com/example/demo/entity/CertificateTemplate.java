import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CertificateTemplate{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String templateName;

    @Column(nullable = false)
    private String backgroundUrl;

    @Column(nullable = false)
    private String fontStyle;

    @Column(nullable = false)
    private String signatureName;
}
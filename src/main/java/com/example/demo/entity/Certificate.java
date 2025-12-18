import jakarta.perisitence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Certificate{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn
    private Student student;

    @ManyToOne
    @JoinColumn
    private CertificateTemplate template;

    @Column

}
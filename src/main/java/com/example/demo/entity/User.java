import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsContstructor
@AllArgsConstructor
@Builder
public class User{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
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

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Builder.Default
    @Column(nullable = false)
    private String role = "STAFF";
}
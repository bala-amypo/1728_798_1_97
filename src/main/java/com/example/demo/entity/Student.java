import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
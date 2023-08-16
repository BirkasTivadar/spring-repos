package employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDateTime createTime;
}

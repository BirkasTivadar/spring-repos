package employees;

import java.time.LocalDateTime;

public class EmployeesService {

    public String sayHello() {
        return "Hello employee " + LocalDateTime.now();
    }
}

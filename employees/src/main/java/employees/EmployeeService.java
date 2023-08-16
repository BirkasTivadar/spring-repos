package employees;

import java.time.LocalDateTime;

public class EmployeeService {

    public String sayHello() {
        return "Hello employee " + LocalDateTime.now();
    }
}

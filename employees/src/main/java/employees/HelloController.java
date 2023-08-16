package employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;
    private final EmployeeService employeeService;

    public HelloController(HelloService helloService, EmployeeService employeeService) {
        this.helloService = helloService;
        this.employeeService = employeeService;
    }

    @GetMapping("/controller")
    public String sayHelloController() {
        return "Hello Controller " + LocalDateTime.now();
    }

    @GetMapping("/service")
    public String sayHelloService() {
        return helloService.sayHello();
    }

    @GetMapping("/employee")
    public String sayHelloEmployee() {
        return employeeService.sayHello();
    }
}

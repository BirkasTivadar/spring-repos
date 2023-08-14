package employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController("/")
public class HelloController {

    private final HelloService helloService;
    private final EmployeesService employeesService;

    public HelloController(HelloService helloService, EmployeesService employeesService) {
        this.helloService = helloService;
        this.employeesService = employeesService;
    }

    @GetMapping("controller")
    public String sayHelloController() {
        return "Hello Controller " + LocalDateTime.now();
    }

    @GetMapping("service")
    public String sayHelloService() {
        return helloService.sayHello();
    }

    @GetMapping("employee")
    public String sayHelloEmployee() {
        return employeesService.sayHello();
    }
}

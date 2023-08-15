package employees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HelloControllerIT {
    @Autowired
    HelloController helloController;

    @Test
    void sayHelloEmployeeTest() {
       String message =  helloController.sayHelloEmployee();

       assertThat(message).startsWith("Hello");
    }
}
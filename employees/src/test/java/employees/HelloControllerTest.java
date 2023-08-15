package employees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {
    @Mock
    HelloService helloService;
    @InjectMocks
    HelloController helloController;

    @Test
    void sayHelloServiceTest() {
        when(helloService.sayHello()).thenReturn("Mock hello");

        String message = helloController.sayHelloService();

        assertThat(message).isEqualTo("Mock hello");
    }
}
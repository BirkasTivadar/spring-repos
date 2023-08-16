package employees;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeesService {

    private ModelMapper modelMapper;

    public List<EmployeeDTO> listEmployees() {
        List<Employee> employees = new ArrayList<>(List.of(new Employee(1L, "Jane", "Doe", LocalDateTime.now()), new Employee(2L, "John", "Doe", LocalDateTime.now())));
        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .toList();
    }
}

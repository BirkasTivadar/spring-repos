package employees;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeesService {

    private ModelMapper modelMapper;

    private List<Employee> employees;

    public void init() {
        employees.add(new Employee(1L, "Jane", "Doe", LocalDateTime.now()));
        employees.add(new Employee(2L, "John", "Doe", LocalDateTime.now()));
        employees.add(new Employee(3L, "Jane", "John", LocalDateTime.now()));
    }


    public List<EmployeeDTO> listEmployees() {
        init();
        List<EmployeeDTO> result = employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .toList();
        employees.clear();
        return result;
    }

    public List<EmployeeDTO> listEmployeesByFirstName(String name) {
        init();
        List<EmployeeDTO> result = employees.stream()
                .filter(employee -> employee.getFirstName().equals(name))
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .toList();
        employees.clear();
        return result;
    }

    public List<EmployeeDTO> listEmployeesByLastName(String name) {
        init();
        List<EmployeeDTO> result = employees.stream()
                .filter(employee -> employee.getLastName().equals(name))
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .toList();
        employees.clear();
        return result;
    }
}

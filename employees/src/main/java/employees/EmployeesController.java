package employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private final EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping
    public List<EmployeeDTO> listEmployees() {
        return employeesService.listEmployees();
    }

    @GetMapping("/firstName")
    public List<EmployeeDTO> listEmployeesByFirstName(@RequestParam(name = "name", required = false) String name) {
        return employeesService.listEmployeesByFirstName(name);
    }

    @GetMapping("/lastName")
    public List<EmployeeDTO> listEmployeesByLasttName(@RequestParam(name = "name", required = false) String name) {
        return employeesService.listEmployeesByLastName(name);
    }
}

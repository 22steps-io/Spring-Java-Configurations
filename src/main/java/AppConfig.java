import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sidda.repository.EmployeeRepository;
import com.sidda.repository.HibernateEmployeeRepositoryImpl;
import com.sidda.service.EmployeeService;
import com.sidda.service.EmployeeServiceImpl;

@Configuration
@ComponentScan({"com.sidda"})
public class AppConfig {

	//@Bean(name="employeeService")
	//public EmployeeService getEmployeeService(){
	//	System.out.println("Spring Application Constructor Injection using Java Configurations ");
	//	EmployeeServiceImpl service = new EmployeeServiceImpl(getEmployeeRepository());
	//	service.setEmployeeRepository(getEmployeeRepository());
	//	return service;
	//}
	
	//@Bean(name="employeeRepository")
	//public EmployeeRepository getEmployeeRepository(){
	//	return new HibernateEmployeeRepositoryImpl();
	//}
}

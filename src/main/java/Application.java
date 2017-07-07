import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sidda.service.EmployeeService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);
		System.out.println("Data : "+employeeService.findAll().get(0).getFirstName());

	}

}

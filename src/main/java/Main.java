import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calculator calculator = (Calculator) context.getBean("calculator");
		calculator.add(1, 2);
		calculator.subtract(5, 3);
	}
}

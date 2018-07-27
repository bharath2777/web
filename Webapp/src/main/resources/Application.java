
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
public class Application {
@ComponentScan
@EnableAutoConfiguration
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
                console.log("test");
	}

}

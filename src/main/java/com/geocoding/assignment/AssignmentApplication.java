import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Transformers;
import org.springframework.integration.http.dsl.Http;
import org.springframework.integration.jms.dsl.Jms;

@SpringBootApplication
@EnableAutoConfiguration
@EnableIntegration
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}


}

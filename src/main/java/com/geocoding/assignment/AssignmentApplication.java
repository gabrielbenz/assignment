package com.geocoding.assignment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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

	/**
	 * Exposes rest api GET method /api/geocode?{address} 
	 * then publish the json formatted message to a JMS queue 
	 * (activeMQ component). Finally, the response is converted 
	 * into json and returned to the http requester.
	 * 
	 * @return IntegrationFlow - the integration flow.
	 */
	@Bean
	public IntegrationFlow restApiInputFlow() {
		return IntegrationFlows.from(Http.inboundGateway("/api/geocode").requestMapping(rm -> rm.methods(HttpMethod.GET))
					.requestPayloadType(String.class).payloadExpression("#requestParams['address']")
				)
				.transform(Transformers.toJson())
				.get();
	}

}

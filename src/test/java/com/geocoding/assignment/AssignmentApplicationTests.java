package com.geocoding.assignment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AssignmentApplicationTests {

	@Test
	public void should_not_throw_exception_on_spring_context_bootstrap() {
		AssignmentApplication.main(new String[] {});
	}

}

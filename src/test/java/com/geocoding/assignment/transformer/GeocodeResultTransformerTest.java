package com.geocoding.assignment.transformer;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.stereotype.Component;

import com.geocoding.assignment.dto.google.GeocodingResultWrapper;
import com.geocoding.assignment.transformer.GeocodeResultTransformer;

@Component
public class GeocodeResultTransformerTest {

	@Test
	public void transform_should_return_null_when_receiving_null_parameter() {
		assertNull(new GeocodeResultTransformer().transform(null));
	}

	@Test
	public void transform_should_return_null_when_receiving_null_result() {
		assertNull(new GeocodeResultTransformer().transform(new GeocodingResultWrapper()));
	}
//
//	@Test
//	public void transform_should_add_formatted_address()  {
//		assertNull(new GeocodeResultTransformer().transform(new GeocodingResultWrapper()));
//	}

}
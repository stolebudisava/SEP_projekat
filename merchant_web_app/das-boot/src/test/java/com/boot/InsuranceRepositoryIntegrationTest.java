package com.boot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.model.insurance.Insurance;
import com.boot.repository.InsuranceRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class InsuranceRepositoryIntegrationTest {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@Test
	public void testFindAll() {
		List<Insurance> insurances = insuranceRepository.findAll();
		assertThat(insurances.size(), is(greaterThanOrEqualTo(0)));
	}
	
}

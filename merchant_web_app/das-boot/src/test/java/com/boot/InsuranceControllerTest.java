package com.boot;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.boot.controller.InsuranceController;
import com.boot.model.insurance.Insurance;
import com.boot.repository.InsuranceRepository;

public class InsuranceControllerTest {
	@InjectMocks
	private InsuranceController ic;

	@Mock
	private InsuranceRepository insuranceRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testShipwreckGet() {
    	Insurance insur = new Insurance();
    	insur.setId(1l);
		when(insuranceRepository.findOne(1l)).thenReturn(insur);

		Insurance insurance = ic.get(1L);

		verify(insuranceRepository).findOne(1l);		

//		assertEquals(1l, wreck.getId().longValue());	
		assertThat(insurance.getId(), is(1l));
	}

}

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
import com.boot.model.Insurance;
import com.boot.repository.InsuranceRepository;

public class ShipwreckControllerTest {
	@InjectMocks
	private InsuranceController sc;

	@Mock
	private InsuranceRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testShipwreckGet() {
    	Insurance sw = new Insurance();
    	sw.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(sw);

		Insurance wreck = sc.get(1L);

		verify(shipwreckRepository).findOne(1l);		

//		assertEquals(1l, wreck.getId().longValue());	
		assertThat(wreck.getId(), is(1l));
	}

}

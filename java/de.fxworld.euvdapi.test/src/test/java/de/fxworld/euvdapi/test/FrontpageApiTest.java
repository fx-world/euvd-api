package de.fxworld.euvdapi.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.*;

import de.fxworld.euvdapi.client.*;
import de.fxworld.euvdapi.client.api.FrontpageApi;
import de.fxworld.euvdapi.client.model.Vulnerability;

class FrontpageApiTest {

	private FrontpageApi apiInstance;

	@BeforeEach
	void setUp() throws Exception {
		 ApiClient defaultClient = Configuration.getDefaultApiClient();
	     defaultClient.setBasePath("https://euvdservices.enisa.europa.eu/api");
	        
	     apiInstance = new FrontpageApi(defaultClient);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLastVulnerabilities() throws ApiException {
		 List<Vulnerability> result = apiInstance.getLastVulnerabilities();
		 assertNotNull(result);
	}
	
	@Test
	void testExploitedVulnerabilities() throws ApiException {
		 List<Vulnerability> result = apiInstance.getExploitedVulnerabilities();
		 assertNotNull(result);
	}
	
	@Test
	void testCriticalVulnerabilities() throws ApiException {
		 List<Vulnerability> result = apiInstance.getCriticalVulnerabilities();
		 assertNotNull(result);
	}

}

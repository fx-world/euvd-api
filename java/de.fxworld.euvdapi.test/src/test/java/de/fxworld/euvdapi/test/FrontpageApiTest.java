package de.fxworld.euvdapi.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.*;

import de.fxworld.euvdapi.client.*;
import de.fxworld.euvdapi.client.api.FrontpageApi;
import de.fxworld.euvdapi.client.model.EnisaIdVulnerability;

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
		 List<EnisaIdVulnerability> result = apiInstance.lastVulnerabilities();
		 assertNotNull(result);
	}
	
	@Test
	void testExploitedVulnerabilities() throws ApiException {
		 List<EnisaIdVulnerability> result = apiInstance.exploitedVulnerabilities();
		 assertNotNull(result);
	}
	
	@Test
	void testCriticalVulnerabilities() throws ApiException {
		 List<EnisaIdVulnerability> result = apiInstance.criticalVulnerabilities();
		 assertNotNull(result);
	}

}

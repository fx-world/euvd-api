package de.fxworld.euvdapi.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import de.fxworld.euvdapi.client.*;
import de.fxworld.euvdapi.client.api.ScoresAndFiltersApi;
import de.fxworld.euvdapi.client.api.SpecificResourcesApi;
import de.fxworld.euvdapi.client.model.*;

class SpecificResourcesApiTest {

	private SpecificResourcesApi apiInstance;

	@BeforeEach
	void setUp() throws Exception {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		defaultClient.setBasePath("https://euvdservices.enisa.europa.eu/api");

		apiInstance = new SpecificResourcesApi(defaultClient);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws ApiException {
		Advisory advisory = apiInstance.getAdvisoryById("oxas-adv-2024-0002");
		assertNotNull(advisory);
		
		Vulnerability ensia = apiInstance.getByEnisaId("EUVD-2025-4893");
		assertNotNull(ensia);
		
		VulnerabilityWithComponents vulnerability = apiInstance.getVulnerabilityById("CVE-2025-24054");
		assertNotNull(vulnerability);
	}

}

package de.fxworld.euvdapi.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.*;

import de.fxworld.euvdapi.client.*;
import de.fxworld.euvdapi.client.api.ScoresAndFiltersApi;
import de.fxworld.euvdapi.client.model.VulnerabilityPage;

class ScoresAndFiltersApiTest {

	private ScoresAndFiltersApi apiInstance;

	@BeforeEach
	void setUp() throws Exception {
		 ApiClient defaultClient = Configuration.getDefaultApiClient();
	     defaultClient.setBasePath("https://euvdservices.enisa.europa.eu/api");
	        
	     apiInstance = new ScoresAndFiltersApi(defaultClient);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLastVulnerabilities() throws ApiException {
		 VulnerabilityPage result = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, null, null, null, null, null, null);
		 assertNotNull(result);
		 assertNotNull(result.getItems());
		 assertEquals(10, result.getItems().size());
		 
		 VulnerabilityPage scoreResult = apiInstance.getVulnerabilities(BigDecimal.ZERO, BigDecimal.TEN, null, null, null, null, null, null, null, null, null, null, null);
		 assertNotNull(scoreResult);
		 assertNotNull(scoreResult.getItems());
		 assertEquals(10, scoreResult.getItems().size());
		 
		 VulnerabilityPage epssResult = apiInstance.getVulnerabilities(null, null, BigDecimal.ZERO, BigDecimal.TEN, null, null, null, null, null, null, null, null, null);
		 assertNotNull(epssResult);
		 assertNotNull(epssResult.getItems());
		 assertEquals(10, epssResult.getItems().size());
		 
		 String fromDate = LocalDate.of(2024, 1, 1).format(DateTimeFormatter.ISO_LOCAL_DATE);
		 String toDate = LocalDate.of(2024, 12, 31).format(DateTimeFormatter.ISO_LOCAL_DATE);
		 VulnerabilityPage dateResult = apiInstance.getVulnerabilities(null, null, null, null, fromDate, toDate, null, null, null, null, null, null, null);
		 assertNotNull(dateResult);
		 assertNotNull(dateResult.getItems());
		 assertEquals(10, dateResult.getItems().size());

		 String product = ".NET 8.0";
		 VulnerabilityPage productResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, product, null, null, null, null, null, null);
		 assertNotNull(productResult);
		 assertNotNull(productResult.getItems());
		 assertEquals(10, productResult.getItems().size());

		 String vendor = "microsoft";
		 VulnerabilityPage vendorResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, vendor, null, null, null, null, null);
		 assertNotNull(vendorResult);
		 assertNotNull(vendorResult.getItems());
		 assertEquals(10, vendorResult.getItems().size());
		 
		 String assigner = "microsoft";
		 VulnerabilityPage assignerResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, null, assigner, null, null, null, null);
		 assertNotNull(assignerResult);
		 assertNotNull(assignerResult.getItems());
		 assertEquals(10, assignerResult.getItems().size());
		 
		 VulnerabilityPage exploitedResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null);
		 assertNotNull(exploitedResult);
		 assertNotNull(exploitedResult.getItems());
		 assertEquals(10, exploitedResult.getItems().size());
		 
		 VulnerabilityPage pageResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, null, null, null, Integer.valueOf(2), null, null);
		 assertNotNull(pageResult);
		 assertNotNull(pageResult.getItems());
		 assertEquals(10, pageResult.getItems().size());
		 
		 VulnerabilityPage sizeResult = apiInstance.getVulnerabilities(null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(100));
		 assertNotNull(sizeResult);
		 assertNotNull(sizeResult.getItems());
		 assertEquals(100, sizeResult.getItems().size());

	}
}

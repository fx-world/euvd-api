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
		VulnerabilityPage result = apiInstance.searchVulnerabilities().execute();
		assertNotNull(result);
		assertNotNull(result.getItems());
		assertEquals(10, result.getItems().size());
		
		VulnerabilityPage scoreResult = apiInstance.searchVulnerabilities().fromScore(BigDecimal.ZERO).toScore(BigDecimal.TEN).execute();
		assertNotNull(scoreResult);
		assertNotNull(scoreResult.getItems());
		assertEquals(10, scoreResult.getItems().size());
		 
		VulnerabilityPage epssResult = apiInstance.searchVulnerabilities().fromEpss(BigDecimal.ZERO).toEpss(BigDecimal.TEN).execute();
		assertNotNull(epssResult);
		assertNotNull(epssResult.getItems());
		assertEquals(10, epssResult.getItems().size());
		 
		String fromDate = LocalDate.of(2024, 1, 1).format(DateTimeFormatter.ISO_LOCAL_DATE);
		String toDate = LocalDate.of(2024, 12, 31).format(DateTimeFormatter.ISO_LOCAL_DATE);
		VulnerabilityPage dateResult = apiInstance.searchVulnerabilities().fromDate(fromDate).toDate(toDate).execute();
		assertNotNull(dateResult);
		assertNotNull(dateResult.getItems());
		assertEquals(10, dateResult.getItems().size());

		String product = ".NET 8.0";
		VulnerabilityPage productResult = apiInstance.searchVulnerabilities().product(product).execute();
		assertNotNull(productResult);
		assertNotNull(productResult.getItems());
		assertEquals(10, productResult.getItems().size());

		String vendor = "microsoft";
		VulnerabilityPage vendorResult = apiInstance.searchVulnerabilities().vendor(vendor).execute();
		assertNotNull(vendorResult);
		assertNotNull(vendorResult.getItems());
		assertEquals(10, vendorResult.getItems().size());
		 
		String assigner = "microsoft";
		VulnerabilityPage assignerResult = apiInstance.searchVulnerabilities().assigner(assigner).execute();
		assertNotNull(assignerResult);
		assertNotNull(assignerResult.getItems());
		assertEquals(10, assignerResult.getItems().size());
		 
		VulnerabilityPage exploitedResult = apiInstance.searchVulnerabilities().exploited(Boolean.TRUE).execute();
		assertNotNull(exploitedResult);
		assertNotNull(exploitedResult.getItems());
		assertEquals(10, exploitedResult.getItems().size());
		 
		VulnerabilityPage pageResult = apiInstance.searchVulnerabilities().page(Integer.valueOf(2)).execute();
		assertNotNull(pageResult);
		assertNotNull(pageResult.getItems());
		assertEquals(10, pageResult.getItems().size());
		 
		VulnerabilityPage sizeResult = apiInstance.searchVulnerabilities().size(Integer.valueOf(100)).execute();
		assertNotNull(sizeResult);
		assertNotNull(sizeResult.getItems());
		assertEquals(100, sizeResult.getItems().size());
	}
}

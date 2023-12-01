package seminars.fourth.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class WebServiceTest {

    @Test
    public void testGetDataFromWebsite() {

        HttpClient httpClient = mock(HttpClient.class);
        WebService webService = new WebService(httpClient);
        String expectedData = "Some data";
        when(httpClient.get(anyString())).thenReturn(expectedData);

        String actualData = webService.getDataFromWebsite("http://example.com");

        verify(httpClient).get("http://example.com");
        assertEquals(expectedData, actualData);
    }
}

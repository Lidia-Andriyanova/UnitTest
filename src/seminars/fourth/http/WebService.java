package seminars.fourth.http;

public class WebService {

    private HttpClient httpClient;

    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String getDataFromWebsite(String request) {

        return httpClient.get(request);
    }
}

package design.pattern.creational.builder.another_approach;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class HTTPRequestDirector {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private int timeout;

    public HTTPRequestDirector(String body, Map<String, String> headers, String method,
                               Map<String, String> queryParams, int timeout, String url) {
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.queryParams = queryParams;
        this.timeout = timeout;
        this.url = url;
    }

    public static HTTPRequestBuilder builder() {
        return new HTTPRequestBuilder();
    }


    public HTTPRequestDirector(HTTPRequestBuilder builder) {
        this.body = builder.getBody();
        this.headers = builder.getHeaders();
        this.method = builder.getMethod();
        this.queryParams = builder.getQueryParams();
        this.timeout = builder.getTimeout();
        this.url = builder.getUrl();
    }

}

package design.pattern.creational.builder.another_approach;

import lombok.Getter;

import java.util.Map;

@Getter
public class HTTPRequestBuilder {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private int timeout;

    HTTPRequestDirector director;

    HTTPRequestBuilder() {
        director = new HTTPRequestDirector(this);
    }


    public HTTPRequestDirector build() {
        return director;
    }

    public HTTPRequestBuilder url(String url) {
        director.setUrl(url);
        return this;
    }

    public HTTPRequestBuilder method(String method) {
        director.setMethod(method);
        return this;
    }

    public HTTPRequestBuilder body(String body) {
        director.setBody(body);
        return this;
    }

    public HTTPRequestBuilder timeout(int timeout) {
        director.setTimeout(timeout);
        return this;
    }

    public HTTPRequestBuilder headers(Map<String, String> headers) {
        director.setHeaders(headers);
        return this;
    }

    public HTTPRequestBuilder queryParams(Map<String, String> queryParams) {
        director.setQueryParams(queryParams);
        return this;
    }


}

package design.pattern.creational.builder;

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
        this.body = builder.body;
        this.headers = builder.headers;
        this.method = builder.method;
        this.queryParams = builder.queryParams;
        this.timeout = builder.timeout;
        this.url = builder.url;
    }


    public static class HTTPRequestBuilder {
        private String url;
        private String method;
        private Map<String, String> headers;
        private String body;
        private Map<String, String> queryParams;
        private int timeout;

        private HTTPRequestDirector director;

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
}

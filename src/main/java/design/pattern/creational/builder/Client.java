package design.pattern.creational.builder;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HTTPRequestDirector httReq = HTTPRequestDirector.builder()
                .url("https://localhost:5432")
                .body("{}")
                .headers(Map.of("key", "value"))
                .build();
        System.out.println(httReq);
    }
}

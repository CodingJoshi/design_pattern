package design.pattern.creational.builder.another_approach;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HTTPRequestDirector obj = HTTPRequestDirector.builder()
                .url("https://localhost:5432")
                .method("GET")
                .build();
        System.out.println(obj);

        obj = HTTPRequestDirector.builder()
                .url("https://localhost:5432")
                .method("POST")
                .body("{'key': value}")
                .timeout(2000)
                .headers(Map.of("ContentType", "Application/Json"))
                .build();
        System.out.println(obj);
    }
}

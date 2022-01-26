package com.aragh;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class StringMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        Arrays.asList("test", "test1").toArray(String[]::new);

        HttpClient httpClient = HttpClient.newBuilder().
        version(HttpClient.Version.HTTP_2).connectTimeout(Duration.of(2, ChronoUnit.SECONDS)).build();

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://www.google.com"))
                .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
	// write your code here
    }
}

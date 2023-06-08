package com.example.springTest.Collector;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import javax.net.ssl.SSLContext;

import lombok.SneakyThrows;

public class DataCollector implements Runnable{

  private URI uri;
  private String payload;
  private String datasource;
  private String source;

  public DataCollector(URI uri,String payload,String datasource,String source) throws InterruptedException, ExecutionException, TimeoutException {
  this.uri = uri;
  this.payload = payload;
  this.datasource = datasource;
  this.source = source;
  }

  @SneakyThrows
  @Override
  public void run(){
  final String responseContent = getData(this.uri, payload,
          "", "");
}
  private String getData(final URI uri, final String postBody, final String username, final String authentication)
          throws InterruptedException, TimeoutException, ExecutionException {

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity requestEntity =
            new HttpEntity<>(postBody, headers);
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> responseEntity = restTemplate.exchange(
            uri,
            HttpMethod.POST,
            requestEntity,
            String.class);



    String response = restTemplate.postForObject(uri,postBody,String.class);
    return response;
  }
}

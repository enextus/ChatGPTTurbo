package com.howtodoinjava.demo;

/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatGptApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChatGptApplication.class, args);
  }
}
*/
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatGptApplication {

  private static final Logger log = LoggerFactory.getLogger(ChatGptApplication.class);

  @Value("${openai.api.key}")
  private String openaiApiKey;

  public static void main(String[] args) {
    SpringApplication.run(ChatGptApplication.class, args);
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("\n\n\n\n\n\n\n\n\n\nOpenAI API Key: " + openaiApiKey + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    log.debug("OpenAI API Key: {}", openaiApiKey);
  }

}


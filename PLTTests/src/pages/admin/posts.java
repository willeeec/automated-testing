package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Posts commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testPosts() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Posts")).click();
  }
}
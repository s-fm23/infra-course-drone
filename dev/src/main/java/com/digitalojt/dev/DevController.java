package com.digitalojt.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevController {
  @GetMapping("/")
  public String get() {
    return "dev";
  }
}

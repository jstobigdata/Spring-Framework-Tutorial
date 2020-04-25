package c.jbd.saop.cjp.sm.gettingstarted.controller;

import c.jbd.saop.cjp.sm.gettingstarted.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  private final static String HELLO_VIEW = "hello-view";

  @GetMapping("/")
  public String homePage(Model model){
    Message message = new Message()
        .setTitle("Getting started with Spring MVC ")
        .setSubTitle("Java based configuration - without web.xml")
        .setBody("Brought to you by - Jstobigdata.com");
    model.addAttribute("message", message);
    return HELLO_VIEW;
  }
}

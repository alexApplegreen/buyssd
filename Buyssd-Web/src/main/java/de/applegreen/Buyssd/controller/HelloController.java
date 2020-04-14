package de.applegreen.Buyssd.controller;

import de.applegreen.Buyssd.util.hasLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController implements hasLogger {

    @GetMapping("/")
    public String hello() {
        this.logger().info("Jemand hat draufgeklickt lol");
        return "Index";
    }
}

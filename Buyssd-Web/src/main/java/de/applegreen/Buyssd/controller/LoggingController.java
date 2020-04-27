package de.applegreen.Buyssd.controller;

import de.applegreen.Buyssd.util.hasLogger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController implements hasLogger {

    @PutMapping("/notify")
    public ResponseEntity log() {
        this.logger().warn("Partymodus schallert rein!");
        return ResponseEntity.ok().build();
    }
}

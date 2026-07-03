package com.harnesslab;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final ZoneId MST_ZONE = ZoneId.of("America/Phoenix");

    @GetMapping("/hello")
    public String hello() {
        String currentMstDateTime = ZonedDateTime.now(MST_ZONE)
                .format(DATE_TIME_FORMATTER);
        return "Hello from Harness Lab. Today date and time in MST: " + currentMstDateTime + " MST";
    }
}

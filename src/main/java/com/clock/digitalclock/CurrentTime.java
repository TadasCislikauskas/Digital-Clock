package com.clock.digitalclock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public CurrentTime() {
    }

    public String currentTime() {
        return dateTimeFormatter.format(now);
    }
}

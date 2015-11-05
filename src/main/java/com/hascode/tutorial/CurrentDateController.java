package com.hascode.tutorial;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-03
 * Time : 오전 10:32
 * To change this template use File | Settings | File and Code Templates.
 */
@RestController
public class CurrentDateController {

    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/currentdate/{pattern}")
    public FormattedDate formatCurrentDate(@PathVariable final String pattern){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);

        return new FormattedDate(counter.incrementAndGet(), pattern, fmt.format(LocalDateTime.now()));
    }
}

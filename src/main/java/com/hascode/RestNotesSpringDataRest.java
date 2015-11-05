package com.hascode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Helloworld
 * User : USER
 * Date : 2015-11-04
 * Time : 오후 3:04
 * To change this template use File | Settings | File and Code Templates.
 */

@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
public class RestNotesSpringDataRest {
    public static void main(String[] args) {
        SpringApplication.run(RestNotesSpringDataRest.class, args);
    }
}
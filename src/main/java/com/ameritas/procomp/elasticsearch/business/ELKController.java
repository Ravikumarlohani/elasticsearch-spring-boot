package com.ameritas.procomp.elasticsearch.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

@RestController
@Slf4j
class ELKController {

    @GetMapping(value = "/")
    public String helloWorld() {
        String response = "Welcome to ELK application " + new Date();
        log.info(response);

        return response;
    }

    @GetMapping(value = "/exception")
    public String exception() {
        String response = "";
        try {
            throw new Exception("Manual EKL Exception raised....");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Exception - ",e);

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();
            log.error("Exception - " + stackTrace);
            response = stackTrace;
        }

        return response;
    }

}

package com.nb.my_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/logging")
    public String index(){
        logger.trace("a trace message");
        logger.debug("a debug message");
        logger.error("a error message");
        logger.info("a info message");
        logger.warn("a warn message");
        return "Howdy! Check out the Logs to see the output";
    }
}

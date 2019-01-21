package com.wanghan.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        //log.info("......ApplicationReadyEvent......");

        logger.info("......ApplicationReadyEvent......");
        logger.debug("......ApplicationReadyEvent......");
        logger.trace("......ApplicationReadyEvent......");
        logger.warn("......ApplicationReadyEvent......");
        logger.error("......ApplicationReadyEvent......");
    }
}

package com.github.fabriciolfj.appsample.config;

import lombok.Getter;
import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

import static com.github.fabriciolfj.appsample.constants.Constants.FEATURE_ALTER;

@Getter
@ConfigurationProperties(prefix = "toogle")
@Configuration
public class ConfigProperties {

    private boolean enabled;

    @Autowired
    private FF4j ff4j;

    @PostConstruct
    public void populate() {
        if (!ff4j.exist(FEATURE_ALTER)) {
            ff4j.createFeature(new Feature(FEATURE_ALTER, enabled));
        }
    }


}

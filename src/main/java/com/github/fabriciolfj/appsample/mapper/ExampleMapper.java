package com.github.fabriciolfj.appsample.mapper;

import com.github.fabriciolfj.appsample.model.Example;

public class ExampleMapper {

    public static Example toDefault() {
        return Example.builder()
                .value("Service default")
                .build();
    }

    public static Example toAlter() {
        return Example.builder()
                .value("Service alternative")
                .build();
    }
}

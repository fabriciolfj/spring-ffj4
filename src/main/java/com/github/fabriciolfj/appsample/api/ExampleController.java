package com.github.fabriciolfj.appsample.api;

import com.github.fabriciolfj.appsample.mapper.ExampleMapper;
import com.github.fabriciolfj.appsample.model.Example;
import lombok.RequiredArgsConstructor;
import org.ff4j.FF4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.fabriciolfj.appsample.constants.Constants.FEATURE_ALTER;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/examples")
public class ExampleController {

    private final FF4j ff4j;

    @GetMapping
    public Example find() {
        if (ff4j.check(FEATURE_ALTER)) {
            return ExampleMapper.toAlter();
        }

        return ExampleMapper.toDefault();
    }
}


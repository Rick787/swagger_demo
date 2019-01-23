package com.rick.democloud;

import org.springframework.stereotype.Component;

@Component
public class DemoCloudImpl implements IDemoCloud {

    @Override
    public String SayHiFromClient(String name) {
        return "sorry,error"+" | " + name;
    }
}

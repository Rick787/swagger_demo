package com.rick.democloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCloudController {

    @Autowired
    private IDemoCloud demoCloud;

    @GetMapping("/hi")
    public String demoCloudController(@RequestParam(value = "name",defaultValue = "rick") String name){
        return demoCloud.SayHiFromClient(name);
    }

}



package com.rick.democloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = DemoCloudImpl.class)
public interface IDemoCloud {

    @GetMapping("/hi")
    String SayHiFromClient(@RequestParam("name") String name);
}

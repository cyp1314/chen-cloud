package com.chen.servertest.feign;

import com.chen.common.constant.ServerConstant;
import com.chen.servertest.feign.callback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = ServerConstant.SERVER_SERVER_SYSTEM,contextId = "helloServiceClient",fallbackFactory = HelloServiceFallback.class)
public interface IHelloService {

    @GetMapping("hello")
    String hello(@RequestParam("name") String name);

}

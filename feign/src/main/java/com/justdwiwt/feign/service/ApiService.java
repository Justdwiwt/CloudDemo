package com.justdwiwt.feign.service;

import com.justdwiwt.feign.service.impl.ApiServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();

}
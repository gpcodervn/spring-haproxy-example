package com.gpcoder.springssl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/v1")
public class UserController {

    @GetMapping("/user")
    public String user(@RequestHeader Map<String, String> headers,
                       @RequestHeader("X-Forwarded-For") String host,
                       @RequestHeader("X-SSL-Client-CN") String commonName
    ) throws UnknownHostException {
        headers.forEach((key, value) -> {
            log.info(String.format("Header '%s' = %s", key, value));
        });
        return MessageFormat.format("Hello {0}, YourIp={1}, MyHost={2}", commonName, host, InetAddress.getLocalHost());
    }
}

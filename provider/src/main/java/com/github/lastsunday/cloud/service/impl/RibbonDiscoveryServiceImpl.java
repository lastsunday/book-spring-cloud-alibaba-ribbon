package com.github.lastsunday.cloud.service.impl;

import com.github.lastsunday.cloud.service.RibbonDiscoveryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@Slf4j
@DubboService(version = "1.0.0", group = "ribbon-provider")
public class RibbonDiscoveryServiceImpl implements RibbonDiscoveryService {

    @Autowired
    private Environment environment;

    @Override
    public String getRibbonConfig() {
        String port = environment.getProperty("local.server.port");
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().toString();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        String result = "load balance success." + "current node ip address is : " + ip + ":" + port;
        return result;
    }
}

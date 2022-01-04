package com.github.lastsunday.cloud.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "ribbon-provider",configuration = NacosRibbonRuleConfig.class)
public class NacosGlobalClientConfig {
}

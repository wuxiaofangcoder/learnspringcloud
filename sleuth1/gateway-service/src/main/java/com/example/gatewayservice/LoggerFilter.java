package com.example.gatewayservice;

import com.netflix.zuul.ZuulFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

@Component
public class LoggerFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operater","forezp");
        System.out.print(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}

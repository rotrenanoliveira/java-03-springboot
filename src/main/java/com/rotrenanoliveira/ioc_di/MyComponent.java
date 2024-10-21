package com.rotrenanoliveira.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyComponent {
    public String callComponent() {
        return "Calling component";
    }
}

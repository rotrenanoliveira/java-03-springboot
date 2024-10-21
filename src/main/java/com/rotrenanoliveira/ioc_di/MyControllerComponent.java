package com.rotrenanoliveira.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MyControllerComponent {

    @Autowired
    MyComponent myComponent;

    @GetMapping("/")
    public String callingComponent() {
        return myComponent.callComponent();
    }
}

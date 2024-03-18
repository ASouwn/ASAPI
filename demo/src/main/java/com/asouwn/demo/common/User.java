package com.asouwn.demo.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    @Value("asouwn")
    private String name;
}

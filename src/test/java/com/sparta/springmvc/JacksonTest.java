package com.sparta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springmvc.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie",95);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(star);

        System.out.println("json = "+json);
    }

    @Test
    @DisplayName("JSON to Object : 기본 생성자 & (get Or set) Method 필요")
    void test2() throws JsonProcessingException{
        String json = "{\"name\":\"Robbie\",\"age\":95}";

        ObjectMapper objectMapper = new ObjectMapper();

        Star star = objectMapper.readValue(json,Star.class);
//        System.out.println("Star.getName() "+star.getName());
//        System.out.println("star.getAge() = " + star.getAge());
    }
}

package com.zqz.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 96300 on 2018/7/21.
 */

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private Integer age;

    private String cupSize;

    public Integer getAge() {
        return age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}

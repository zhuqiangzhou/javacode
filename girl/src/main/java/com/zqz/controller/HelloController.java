package com.zqz.controller;

import com.zqz.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by 96300 on 2018/7/21.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

        @Autowired
        private GirlProperties girlProperties;

        @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
        public String say(@PathParam("id") Integer id) {
            //return girlProperties.toString();
              // System.out.println("试试公司电脑git上传");
            return "id:"+id;
        }
}

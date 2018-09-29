package com.yfive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author yFive
 * @version 1.0
 * @description {}
 * @company yFive
 * @date 2018/9/10 17:16
 */
@RestController
@RequestMapping("/logger")
public class LoggerController {
    @GetMapping("/add")
    public void add(){
        System.out.println("-------------->>:LoggerController add()");
    }
}

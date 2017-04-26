package com.hsbc.mods.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bala on 26/04/2017.
 */
@RestController
public class ModsController {

    @RequestMapping("/")
    String home() {
        return "Hello World!!!!--HEY";
    }


}

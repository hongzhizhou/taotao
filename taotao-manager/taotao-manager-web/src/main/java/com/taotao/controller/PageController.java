/**
 * System Name： SDN Platform
 * <p>
 * File Name： PageController
 * <p>
 * Creating Time： 2018-11-16 00:02
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * Function Description:  <br>
 * Writer: hzz89 . <br>
 * Creating Time: 2018-11-16 00:02 <br>
 * Version:  <br>
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
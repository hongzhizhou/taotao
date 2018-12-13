/**
 * System Name： SDN Platform
 * <p>
 * File Name： ItemController
 * <p>
 * Creating Time： 2018-11-28 10:00
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.taotao.controller;

import com.taotao.utils.EasyUIResult;
import com.taotao.pojo.TbItemCat;
import com.taotao.service.ItemCatService;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-28 10:00 <br>
 * Version:  <br>
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    ItemCatService itemCatService;


    @RequestMapping("/list")
    @ResponseBody
    public EasyUIResult getItemList(@RequestParam(defaultValue = "1") Integer page,
                                    @RequestParam(defaultValue = "30") Integer rows) {
        return itemService.getItemList(page, rows);
    }

    @RequestMapping("/cat/list")
    @ResponseBody
    public List<Map<String, Object>> categoryList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<Map<String, Object>> category = new ArrayList<>();
        List<TbItemCat> tbItemCats = itemCatService.getItemCatList(parentId);
        for (TbItemCat tbItemCat : tbItemCats) {
            Map<String, Object> node = new HashMap<>();
            node.put("id", tbItemCat.getId());
            node.put("text", tbItemCat.getName());
            node.put("state", tbItemCat.getIsParent() ? "closed" : "open");
            category.add(node);
        }
        return category;
    }
}
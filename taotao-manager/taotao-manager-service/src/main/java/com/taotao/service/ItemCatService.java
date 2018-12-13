/**
 * System Name： SDN Platform
 * <p>
 * File Name： ItemCatService
 * <p>
 * Creating Time： 2018-11-28 15:14
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.taotao.service;

import com.taotao.pojo.TbItemCat;

import java.util.List;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-28 15:14 <br>
 * Version:  <br>
 */
public interface ItemCatService {

    List<TbItemCat> getItemCatList(Long parentId);

}
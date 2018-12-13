/**
 * System Name： SDN Platform
 * <p>
 * File Name： ItemService
 * <p>
 * Creating Time： 2018-11-28 09:49
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.taotao.service;

import com.taotao.utils.EasyUIResult;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-28 09:49 <br>
 * Version:  <br>
 */
public interface ItemService {

    EasyUIResult getItemList(Integer page, Integer rows);
}
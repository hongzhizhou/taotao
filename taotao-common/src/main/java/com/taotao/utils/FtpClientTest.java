/**
 * System Name： SDN Platform
 * <p>
 * File Name： FtpClient
 * <p>
 * Creating Time： 2018-11-29 10:18
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package com.taotao.utils;

import java.io.FileInputStream;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-29 10:18 <br>
 * Version:  <br>
 */
public class FtpClientTest {
    public static void main(String[] args) throws Exception {
        boolean flag = FtpUtil.uploadFile("10.190.49.136", 21, "hongzz", "123456",
                                          "/home/hongzz", "/ftp",
                                          "123.png", new FileInputStream("F:\\123.png"));
        System.out.println(flag);
    }
}

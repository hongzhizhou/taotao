/**
 * System Name： SDN Platform
 * <p>
 * File Name： TestServiceFramWork
 * <p>
 * Creating Time： 2018-11-23 15:29
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package test;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-23 15:29 <br>
 * Version:  <br>
 */
public class TestServiceFramWork {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("test.QuryServiceProvider");
        QueryService queryService = Services.getService("Number");
        int num = queryService.queryCount();
        System.out.println(num);
    }
}
/**
 * System Name： SDN Platform
 * <p>
 * File Name： NumberQueryService
 * <p>
 * Creating Time： 2018-11-23 15:23
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
 * Creating Time: 2018-11-23 15:23 <br>
 * Version:  <br>
 */
public class NumberQueryService implements QueryService {
    int[] a = new int[8];

    @Override
    public int queryCount() {
        return a.length;
    }
}
/**
 * System Name： SDN Platform
 * <p>
 * File Name： QuryServiceProvider
 * <p>
 * Creating Time： 2018-11-23 15:25
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
 * Creating Time: 2018-11-23 15:25 <br>
 * Version:  <br>
 */
public class QuryServiceProvider implements Provider {
    static {
        Services.register("Number", new QuryServiceProvider());
    }

    @Override
    public QueryService getQueryService() {
        return new NumberQueryService();
    }
}
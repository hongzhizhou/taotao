/**
 * System Name： SDN Platform
 * <p>
 * File Name： Services
 * <p>
 * Creating Time： 2018-11-23 15:26
 * <p>
 * Copyright (c) 2015-2025 Fiberhome Technologies.
 * 88,YouKeYuan Road, Hongshan District.,Wuhan,P.R.China,
 * Wuhan Research Institute of Post & Telecommunication.
 * <p>
 * All rights reserved.
 */

package test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Function Description:  <br>
 * Writer: hongzhizhou . <br>
 * Creating Time: 2018-11-23 15:26 <br>
 * Version:  <br>
 */
public class Services {
    private static final Map<String, Provider> registerProviders = new ConcurrentHashMap<>();

    public static void register(String name, Provider provider) {
        registerProviders.put(name, provider);
    }

    public static QueryService getService(String name) {
        Provider p = registerProviders.get(name);
        if (p == null) {
            throw new IllegalArgumentException("can not find provider for " + name);
        }
        return p.getQueryService();
    }
}
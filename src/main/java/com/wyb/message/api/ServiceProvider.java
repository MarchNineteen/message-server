package com.wyb.message.api;

import java.util.HashMap;
import java.util.Map;

import com.wyb.message.enums.PlatSource;

/**
 * @author Marcher丶
 */
public class ServiceProvider {

    public static Map<PlatSource, AllService> allServiceMap = new HashMap<>();

    public static AllService getThirdAllService(PlatSource platSource) {
        switch (platSource) {
        case Ali:
            return allServiceMap.get(platSource);
        default:
            return null;
        }
    }
}

package com.wyb.message.exception;

/**
 * @author Marcher丶
 */
public class NoService extends RuntimeException {

    public NoService() {
        super("未提供该服务");
    }
}

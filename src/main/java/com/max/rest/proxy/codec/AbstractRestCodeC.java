package com.max.rest.proxy.codec;


import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Slf4j
public abstract class AbstractRestCodeC {
    public abstract <T> byte[] encodeArg(T obj);

    public  abstract <T> T decodeResult(int statusCode, Map<String,List<String>> headers, byte[] bytes, Class<T> clazz);

}

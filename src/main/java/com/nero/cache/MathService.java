package com.nero.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2018/2/9
 * time : 11:14
 * </p>
 *
 * @author Nero
 */
@Component
public class MathService{

    @Cacheable("piDecimals")
    public int computePiDecimal(int i) {
        System.out.println("进入计算：" + i);
        i = i * 10;
        return i;
    }

}
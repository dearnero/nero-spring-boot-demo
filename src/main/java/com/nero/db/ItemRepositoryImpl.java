package com.nero.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * date : 2018/2/9
 * time : 17:57
 * </p>
 *
 * @author Nero
 */
@Repository
public class ItemRepositoryImpl {

    @Autowired
    private ItemMapper itemMapper;

    @Cacheable(value = "item")
    public Item findById(Long id) {
        System.out.println("进入查询......" + id);
        return itemMapper.findById(id);
    }


}

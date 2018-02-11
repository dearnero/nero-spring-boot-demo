package com.nero.db;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * date : 2018/2/9
 * time : 17:51
 * </p>
 *
 * @author Nero
 */
@Data
public class Item implements Serializable{

    private Long id;

    private String name;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.hwua.entity;

import java.io.Serializable;

/**
 * (TBrand)实体类
 *
 * @author makejava
 * @since 2020-03-02 16:18:28
 */
public class TBrand implements Serializable {
    private static final long serialVersionUID = 648382626847478706L;
    
    private Integer id;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
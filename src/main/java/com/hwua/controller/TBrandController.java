package com.hwua.controller;

import com.hwua.entity.TBrand;
import com.hwua.service.TBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TBrand)表控制层
 *
 * @author makejava
 * @since 2020-03-02 16:18:28
 */
@RestController
@RequestMapping("tBrand")
public class TBrandController {
    /**
     * 服务对象
     */
    @Resource
    private TBrandService tBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TBrand selectOne(Integer id) {
        return this.tBrandService.queryById(id);
    }

}
package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Category;
import com.company.project.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-10.
*/
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @PostMapping("/add")
    public Result add(Category category) {
        categoryService.save(category);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        Category category = categoryService.findById(id);
        if(category != null)
        {
            categoryService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(Category category) {
        categoryService.update(category);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        Category category = categoryService.findById(id);
        if(category != null)
        {
            return ResultGenerator.genSuccessResult(category);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Category> list = categoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}

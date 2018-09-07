package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BlogLabel;
import com.company.project.service.BlogLabelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-07.
*/
@RestController
@RequestMapping("/blog/label")
public class BlogLabelController {
    @Resource
    private BlogLabelService blogLabelService;

    @PostMapping
    public Result add(@RequestBody BlogLabel blogLabel) {
        blogLabelService.save(blogLabel);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        blogLabelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody BlogLabel blogLabel) {
        blogLabelService.update(blogLabel);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        BlogLabel blogLabel = blogLabelService.findById(id);
        return ResultGenerator.genSuccessResult(blogLabel);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BlogLabel> list = blogLabelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

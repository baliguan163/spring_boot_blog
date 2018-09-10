package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Pv;
import com.company.project.service.PvService;
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
@RequestMapping("/pv")
public class PvController {
    @Resource
    private PvService pvService;

    @PostMapping("/add")
    public Result add(Pv pv) {
        pvService.save(pv);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        Pv pv = pvService.findById(id);
        if(pv != null)
        {
            pvService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(Pv pv) {
        pvService.update(pv);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        Pv pv = pvService.findById(id);
        if(pv != null)
        {
            return ResultGenerator.genSuccessResult(pv);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Pv> list = pvService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}

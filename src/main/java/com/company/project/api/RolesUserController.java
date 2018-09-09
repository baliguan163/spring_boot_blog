package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RolesUser;
import com.company.project.service.RolesUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-09-09.
*/
@RestController
@RequestMapping("/roles/user")
public class RolesUserController {
    @Resource
    private RolesUserService rolesUserService;

    @PostMapping
    public Result add(@RequestBody RolesUser rolesUser) {
        rolesUserService.save(rolesUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        rolesUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody RolesUser rolesUser) {
        rolesUserService.update(rolesUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        RolesUser rolesUser = rolesUserService.findById(id);
        return ResultGenerator.genSuccessResult(rolesUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RolesUser> list = rolesUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

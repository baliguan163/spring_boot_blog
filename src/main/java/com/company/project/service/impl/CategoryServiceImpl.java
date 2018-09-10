package com.company.project.service.impl;

import com.company.project.dao.CategoryMapper;
import com.company.project.model.Category;
import com.company.project.service.CategoryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-10.
 */
@Service
@Transactional
public class CategoryServiceImpl extends AbstractService<Category> implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

}

package com.company.project.service.impl;

import com.company.project.dao.FansMapper;
import com.company.project.model.Fans;
import com.company.project.service.FansService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-07.
 */
@Service
@Transactional
public class FansServiceImpl extends AbstractService<Fans> implements FansService {
    @Resource
    private FansMapper fansMapper;

}

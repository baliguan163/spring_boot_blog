package com.company.project.service.impl;

import com.company.project.dao.PvMapper;
import com.company.project.model.Pv;
import com.company.project.service.PvService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-09.
 */
@Service
@Transactional
public class PvServiceImpl extends AbstractService<Pv> implements PvService {
    @Resource
    private PvMapper pvMapper;

}

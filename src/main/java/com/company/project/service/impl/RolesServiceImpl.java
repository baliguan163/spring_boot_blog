package com.company.project.service.impl;

import com.company.project.dao.RolesMapper;
import com.company.project.model.Roles;
import com.company.project.service.RolesService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-10.
 */
@Service
@Transactional
public class RolesServiceImpl extends AbstractService<Roles> implements RolesService {
    @Resource
    private RolesMapper rolesMapper;

}

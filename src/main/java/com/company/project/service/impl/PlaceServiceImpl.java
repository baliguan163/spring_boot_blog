package com.company.project.service.impl;

import com.company.project.dao.PlaceMapper;
import com.company.project.model.Place;
import com.company.project.service.PlaceService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-09-07.
 */
@Service
@Transactional
public class PlaceServiceImpl extends AbstractService<Place> implements PlaceService {
    @Resource
    private PlaceMapper placeMapper;

}

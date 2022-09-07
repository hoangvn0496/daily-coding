package com.learning.service.impl;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
//</editor-fold>

abstract class AbstractService {

    @Lazy
    @Autowired
    protected DozerBeanMapper dozerMapper;
}

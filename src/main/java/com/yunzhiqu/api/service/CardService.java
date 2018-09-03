package com.yunzhiqu.api.service;

import com.yunzhiqu.api.dao.mapper.TCardMapper;
import com.yunzhiqu.api.datasource.utils.ServiceException;
import com.yunzhiqu.api.modal.TCard;
import com.yunzhiqu.api.modal.TCardExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

@Service
public class CardService {

    @Autowired
    TCardMapper cardMapper;

    public TCard getCardByOpenid(String openid)throws ServiceException {
        TCardExample ex= new TCardExample();
        TCardExample.Criteria ec = ex.createCriteria();
        //ec.andStatusEqualTo(true);
        ec.andOpenidEqualTo(openid);

        List<TCard> list = cardMapper.selectByExampleWithBLOBs(ex);
        if(list !=null && list.size()>0)
        {
            return  list.get(0);
        }
        return  null;

    }

}
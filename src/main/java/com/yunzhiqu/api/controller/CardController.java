package com.yunzhiqu.api.controller;

import com.yunzhiqu.api.base.ResponseDefine;
import com.yunzhiqu.api.datasource.utils.ServiceException;
import com.yunzhiqu.api.modal.TCard;
import com.yunzhiqu.api.service.CardService;
import com.yunzhiqu.api.utils.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

@RestController
@RequestMapping(value ="card")
public class CardController {
    @Autowired
    CardService cardService;


    //获取用户信息
    @RequestMapping(value = "/getcardDetail")
    public String getcardDetail(@RequestParam("openid") String openid, HttpServletRequest req)throws ServiceException {
        try {
            TCard card = cardService.getCardByOpenid(openid);
            if (card == null) {
                return ResUtil.convert(ResponseDefine.Novalidate, "无效的用户id", 0);
            }
            return ResUtil.convert(ResponseDefine.Success, "success", card);
        }catch (Exception e){
            e.printStackTrace();
            return ResUtil.convert(ResponseDefine.Exception, "系統正在休息，请稍后再试", 0);
        }
    }




}
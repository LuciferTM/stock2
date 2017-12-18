package com.lucifer.stock.controller;

import com.lucifer.stock.model.MarketEnum;
import com.lucifer.stock.model.StockBasic;
import com.lucifer.stock.service.StockBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/15
 */
@Controller
@RequestMapping("/stock")
public class StockBasicController {
    @Autowired
    StockBasicService stockBasicService;

    @RequestMapping("/create")
    @ResponseBody
    public Map<String, Object> createBasicStock(){
        StockBasic stockBasic = new StockBasic();
        System.out.println(stockBasic.getId());
        stockBasic.setCode("300244");
        stockBasic.setCapital(5.51);
        stockBasic.setMarket(MarketEnum.SZ);
        stockBasicService.save(stockBasic);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("state", "success");
        return map;
    }
}

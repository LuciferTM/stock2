package com.lucifer.stock.service;

import com.lucifer.stock.model.stock.StockBasic;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/15
 */
public interface StockBasicService {
    StockBasic findById(Long id);
    StockBasic save(StockBasic stockBasic);
    List<StockBasic> findAll();
}

package com.lucifer.stock.service.impl;

import com.lucifer.stock.model.stock.StockBasic;
import com.lucifer.stock.repositories.StockBasicRepository;
import com.lucifer.stock.service.StockBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/15
 */
@Service
public class StockBasicServiceImpl implements StockBasicService {
    @Autowired
    StockBasicRepository stockBasicRepository;

    @Override
    public StockBasic findById(Long id) {
        return null;
    }

    @Override
    public StockBasic save(StockBasic stockBasic) {
        return stockBasicRepository.save(stockBasic);
    }

    @Override
    public List<StockBasic> findAll() {
        return null;
    }
}

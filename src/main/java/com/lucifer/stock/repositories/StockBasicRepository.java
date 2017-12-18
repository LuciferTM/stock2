package com.lucifer.stock.repositories;

import com.lucifer.stock.model.StockBasic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/15
 */
public interface StockBasicRepository extends JpaRepository<StockBasic, Serializable> {
    StockBasic findById(Long id);
}

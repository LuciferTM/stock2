package com.lucifer.stock.test.stockbasic;

import com.lucifer.stock.model.MarketEnum;
import com.lucifer.stock.model.StockBasic;
import com.lucifer.stock.service.StockBasicService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/15
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/applicationContext.xml",
})

//@Ignore
public class StockBasicTest {

    @Autowired
    StockBasicService stockBasicService;

    @Test
    public void testCreateStockBasic() throws Exception {
        StockBasic stockBasic = new StockBasic();
        System.out.println(stockBasic.getId());
        stockBasic.setCode("300244");
        stockBasic.setCapital(5.51);
        stockBasic.setMarket(MarketEnum.SZ);
        stockBasicService.save(stockBasic);
    }

}

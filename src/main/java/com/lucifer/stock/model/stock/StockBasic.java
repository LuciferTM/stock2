package com.lucifer.stock.model.stock;

import com.lucifer.stock.constants.SchemaConstant;
import com.lucifer.stock.model.generic.StockGenericEntity;


import javax.persistence.*;


/**
 * <p>Title:</p>
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author Lucifer
 * @date 2017/12/8
 */
@Entity
@Table(name = "STOCKBASIC", schema= SchemaConstant.STOCK_SCHEMA)
public class StockBasic extends StockGenericEntity<Integer, StockBasic> {
    @Id
    @Column(name = "id", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "market")
    @Enumerated(value = EnumType.STRING)
    private MarketEnum market;

    @Column(name = "code", length = 8)
    private String code;

    @Column(name = "price")
    private Double price;

    @Column(name = "p_net_estate")
    private Double pNetEstate;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "last_year_profit")
    private Double lastYearProfit;

    @Column(name = "last_year_kf_profit")
    private Double lastYearKFProfit;

    @Column(name = "ttm_profit")
    private Double ttmProfit;

    @Column(name = "ttm_kf_profit")
    private Double ttmKFProfit;

    public StockBasic() {
    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public MarketEnum getMarket() {
        return market;
    }

    public void setMarket(MarketEnum market) {
        this.market = market;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getpNetEstate() {
        return pNetEstate;
    }

    public void setpNetEstate(Double pNetEstate) {
        this.pNetEstate = pNetEstate;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getLastYearProfit() {
        return lastYearProfit;
    }

    public void setLastYearProfit(Double lastYearProfit) {
        this.lastYearProfit = lastYearProfit;
    }

    public Double getLastYearKFProfit() {
        return lastYearKFProfit;
    }

    public void setLastYearKFProfit(Double lastYearKFProfit) {
        this.lastYearKFProfit = lastYearKFProfit;
    }

    public Double getTtmProfit() {
        return ttmProfit;
    }

    public void setTtmProfit(Double ttmProfit) {
        this.ttmProfit = ttmProfit;
    }

    public Double getTtmKFProfit() {
        return ttmKFProfit;
    }

    public void setTtmKFProfit(Double ttmKFProfit) {
        this.ttmKFProfit = ttmKFProfit;
    }
}

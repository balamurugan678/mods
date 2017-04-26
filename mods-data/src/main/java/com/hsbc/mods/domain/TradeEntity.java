package com.hsbc.mods.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bala on 26/04/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class TradeEntity implements Serializable{

    @Id
    @GeneratedValue
    private Long trade_id;

    @Column
    private String portfolio;

    @Column
    private String trading_style;

    @CreatedDate
    private Date submission_date;

    public Long getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(Long trade_id) {
        this.trade_id = trade_id;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getTrading_style() {
        return trading_style;
    }

    public void setTrading_style(String trading_style) {
        this.trading_style = trading_style;
    }

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }
}

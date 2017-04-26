package com.hsbc.mods.service;

import com.hsbc.mods.domain.TradeEntity;

import java.util.Collection;

/**
 * Created by Bala on 26/04/2017.
 */
public interface TradeService {

    TradeEntity save(TradeEntity entity);

    TradeEntity find(Long id);

}

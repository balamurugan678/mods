package com.hsbc.mods.service.impl;

import com.hsbc.mods.domain.TradeEntity;
import com.hsbc.mods.repository.TradeRepository;
import com.hsbc.mods.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by Bala on 26/04/2017.
 */
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository repository;

    @Override
    @Transactional
    public TradeEntity save(TradeEntity entity) {
        return repository.save(entity);
    }

    @Override
    public TradeEntity find(Long id) {
        TradeEntity tradeEntity = repository.findOne(id);
        return tradeEntity;
    }


}

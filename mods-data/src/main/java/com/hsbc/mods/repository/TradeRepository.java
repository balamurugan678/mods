package com.hsbc.mods.repository;

import com.hsbc.mods.domain.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bala on 26/04/2017.
 */
@Repository
public interface TradeRepository extends CrudRepository<TradeEntity, Long> {


}

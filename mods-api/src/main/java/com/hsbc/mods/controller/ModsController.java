package com.hsbc.mods.controller;

import com.hsbc.mods.domain.TradeEntity;
import com.hsbc.mods.service.TradeService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Bala on 26/04/2017.
 */
@RestController
@RequestMapping(value = "mods")
public class ModsController {

    @Autowired
    private TradeService tradeService;

    @ApiOperation(value = "getTrade", nickname = "getTrade")
    @RequestMapping(value = "/trade/{tradeId}", method = RequestMethod.GET)

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TradeEntity.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public TradeEntity getTrade(@PathVariable String tradeId) {
        TradeEntity tradeEntity = tradeService.find(Long.valueOf(tradeId));
        return tradeEntity;
    }

    @ApiOperation(value = "createTrade", nickname = "createTrade")
    @RequestMapping(value = "/trade", method = RequestMethod.POST)

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TradeEntity.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public TradeEntity createTrade(@RequestBody TradeEntity tradeEntity) {
        TradeEntity persistedTradeEntity =  tradeService.save(tradeEntity);
        return persistedTradeEntity;
    }


}

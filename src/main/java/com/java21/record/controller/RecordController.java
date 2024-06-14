package com.java21.record.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java21.record.dto.CafeInfoReqDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RecordController {

    @RequestMapping("/record")
    public String hello(CafeInfoReqDto cafeInfoReqDto) {
        log.info("cafeInfoReqDto: {}", cafeInfoReqDto);
        return null;
    }

}
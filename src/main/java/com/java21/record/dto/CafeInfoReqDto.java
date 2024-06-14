package com.java21.record.dto;

import lombok.Builder;

public record CafeInfoReqDto(
    
    String cafeName,
    String cafeAddress,
    String mainMenu){

    @Builder
    public CafeInfoReqDto {
        if(mainMenu == null){
            mainMenu = "커피";
        }
    }

}

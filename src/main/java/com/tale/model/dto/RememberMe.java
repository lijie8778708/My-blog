package com.tale.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class RememberMe {

    private Integer      uid;
    private Integer      expires;
    private String       token;
    private List<String> recentIp;

}

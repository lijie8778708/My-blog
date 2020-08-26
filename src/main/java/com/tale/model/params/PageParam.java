package com.tale.model.params;

import lombok.Data;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class PageParam {

    private Integer page = 1;
    private Integer limit = 12;

}

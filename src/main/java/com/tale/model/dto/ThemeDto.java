package com.tale.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class ThemeDto implements Serializable {

    private static final long serialVersionUID = 7122701941161403708L;

	/**
     * 主题名称
     */
    private String name;

    /**
     * 是否有设置项
     */
    private boolean hasSetting;

    public ThemeDto(String name) {
        this.name = name;
    }

}

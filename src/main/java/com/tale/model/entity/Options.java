package com.tale.model.entity;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
@Table(name = "t_options", pk = "name")
@EqualsAndHashCode(callSuper = true)
public class Options extends Model {

    /**
     * 配置键
     */
    private String name;

    /**
     * 配置值
     */
    private String value;

    /**
     * 配置描述
     */
    private String description;

}
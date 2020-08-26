package com.tale.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PluginMenu {

    private String name;
    private String slug;
    private String icon;

}

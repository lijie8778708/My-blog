package com.tale.model.entity;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Table;
import lombok.Data;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
@Table(name = "t_attach")
public class Attach extends Model {

    private Integer id;
    private String  fname;
    private String  ftype;
    private String  fkey;
    private Integer authorId;
    private Integer created;

}

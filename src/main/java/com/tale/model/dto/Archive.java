package com.tale.model.dto;

import com.tale.model.entity.Contents;
import io.github.biezhi.anima.Model;
import lombok.Data;

import java.util.Date;
import java.util.List;
/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class Archive extends Model {

    private String         dateStr;
    private Date           date;
    private String         count;
    private List<Contents> articles;

}

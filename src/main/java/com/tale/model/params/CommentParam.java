package com.tale.model.params;

import lombok.Data;
import lombok.ToString;
/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
@ToString(callSuper = true)
public class CommentParam extends PageParam {

    private Integer excludeUID;

}

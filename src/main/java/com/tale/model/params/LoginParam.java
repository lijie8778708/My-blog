package com.tale.model.params;

import lombok.Data;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class LoginParam {

    private String username;
    private String password;
    private String rememberMe;

}

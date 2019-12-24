package com.springcloud.frame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户基本信息
 *
 * @author gaohao
 * @date 2019/12/24 11:16
 * @desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Long id;

    private String username;

    private String email;

    public static UserInfo invalid() {
        return new UserInfo(-1L, "", "");
    }
}

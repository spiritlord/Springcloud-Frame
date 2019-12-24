package com.springcloud.frame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 课程信息请求
 *
 * @author gaohao
 * @date 2019/12/24 11:29
 * @desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfosRequest {

    private List<Long> ids;
}

package com.springcloud.frame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 课程基本信息
 *
 * @author gaohao
 * @date 2019/12/24 11:22
 * @desc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfo {

    private Long id;

    private String courseName;

    private String courseType;

    private String courseIcon;

    private String courseIntro;

    public static CourseInfo invalid() {
        return new CourseInfo(-1L,
                "", "", "", "");
    }
}

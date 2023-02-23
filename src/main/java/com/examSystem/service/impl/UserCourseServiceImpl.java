package com.examSystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examSystem.domain.entity.UserCourse;
import com.examSystem.mapper.UserCourseMapper;
import com.examSystem.service.UserCourseService;
import org.springframework.stereotype.Service;

/**
 * (UserCourse)表服务实现类
 *
 * @author makejava
 * @since 2023-02-22 20:02:22
 */
@Service("userCourseService")
public class UserCourseServiceImpl extends ServiceImpl<UserCourseMapper, UserCourse> implements UserCourseService {

}


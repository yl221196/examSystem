package com.examSystem.handler.security;

import com.alibaba.fastjson.JSON;
import com.examSystem.domain.ResponseResult;
import com.examSystem.enums.HttpCodeEnum;
import com.examSystem.utils.WebUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
//权限异常处理
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
        accessDeniedException.printStackTrace();

        ResponseResult result = ResponseResult.errorResult(HttpCodeEnum.NO_PERMISSIONS);

        WebUtils.renderString(response, JSON.toJSONString(result));
    }
}

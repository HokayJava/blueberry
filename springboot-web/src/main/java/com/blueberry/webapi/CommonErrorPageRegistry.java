package com.blueberry.webapi;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author hekai
 * @create 2018-02-17-13:40
 */
@Component
public class CommonErrorPageRegistry implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {

       ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
       ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
       // 根据异常返回制定错误页面
       ErrorPage args = new ErrorPage(ArithmeticException.class, "/args.html");

        registry.addErrorPages(e404, e500, args);
    }
}

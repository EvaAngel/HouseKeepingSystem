package cn.shouguang.controller;

import cn.shouguang.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserApi userApi;

    @RequestMapping("/isLogin.do")
    public void isLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session)
    {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         boolean bool=userApi.isLogin(username,password);
         System.out.println(username);
    }
}

package com.sheng.interceptor;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.sheng.util.JWTUtils;
import com.sheng.vo.Meta;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        if(method.equals(HttpMethod.OPTIONS.name())){
            return true;
        }
        String token = request.getHeader("token");
        Meta meta = new Meta();
        try{
            JWTUtils.verify(token);
            meta.setMsg("身份验证成功");
            meta.setStatus(200);
            return true;
        }catch (TokenExpiredException e) {
            meta.setStatus(422);
            meta.setMsg("Token已经过期!!!");
        } catch (SignatureVerificationException e){
            meta.setStatus(422);
            meta.setMsg("签名错误!!!");
        } catch (AlgorithmMismatchException e){
            meta.setStatus(422);
            meta.setMsg("加密算法不匹配!!!");
        } catch (Exception e) {
            e.printStackTrace();
            meta.setStatus(422);
            meta.setMsg("无效token~~");
        }
        String res = JSON.toJSONString(meta);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(res);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}

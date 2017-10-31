package com.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kaze 2017/10/28
 */
@Component
public class AccessFilter extends ZuulFilter {

    private final String post = "post";
    private final String login = "/login";
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL());
        String method = request.getMethod();
        String uri = request.getRequestURI();
        //如果是登录操作，则不判断是否有token
        if (post.equals(method.toLowerCase()) && uri.endsWith(login)) {
            return null;
        }
        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            logger.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        } else {
            logger.info("access token ok");
        }
        return null;
    }

}
package org.lanwei.morning.os.jwt;

import org.lanwei.morning.os.security.AccountCredentials;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * jwt登陆验证
 *
 * @author lanwei 2018-03-23
 */
public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    public JWTLoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    /**
     * 验证
     *
     * @param req
     * @param rep
     * @return
     * @throws AuthenticationException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse rep)
        throws AuthenticationException, IOException, ServletException {
        // JSON反序列化成 AccountCredentials（包含用户名与密码）
        String name = req.getParameter("username");
        String pwt = req.getParameter("password");

        AccountCredentials creds = new AccountCredentials(name, pwt);

        // 返回一个验证令牌
        return getAuthenticationManager().authenticate(
            new UsernamePasswordAuthenticationToken(creds.getUsername(), creds.getPassword()));
    }

    /**
     * 验证成功时
     *
     * @param req
     * @param res
     * @param chain
     * @param auth
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain, Authentication auth)
        throws IOException, ServletException {

        TokenAuthenticationService.addAuthentication(res, auth.getName());
    }


    /**
     * 验证失败时
     *
     * @param request
     * @param response
     * @param failed
     * @throws IOException
     * @throws ServletException
     */
    //    @Override
    //    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
    //        AuthenticationException failed) throws IOException, ServletException {
    //
    //        response.setContentType("application/json");
    //        response.setStatus(HttpServletResponse.SC_OK);
    //        response.getOutputStream().println(JSONResult.fillResultString(500, "user not found", ""));
    //    }
}

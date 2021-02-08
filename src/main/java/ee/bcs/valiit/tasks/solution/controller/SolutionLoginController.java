package ee.bcs.valiit.tasks.solution.controller;

import ee.bcs.valiit.tasks.solution.JwtTokenFilter;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SolutionLoginController {
    @GetMapping("public/solution/login")
    public String login(){
        Date now = new Date();
        Date expiration = new Date(now.getTime() + 1000 * 60 * 60);
        JwtBuilder builder = Jwts.builder()
                .setExpiration(expiration)
                .setIssuedAt(now)
                .setIssuer("vali-it")
                .signWith(SignatureAlgorithm.HS256, JwtTokenFilter.SECRET)
                .claim("userName", "admin");
        return builder.compact();
    }
}

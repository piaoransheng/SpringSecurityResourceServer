package lhc.util;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Author lhc
 * @Date 2020-09-25 14:46
 **/
public class SecurityUtil {
    public static Object getPrincipal() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
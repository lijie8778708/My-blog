package com.tale;

import com.blade.Blade;
import com.blade.security.web.csrf.CsrfMiddleware;
import com.tale.bootstrap.TaleLoader;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
public class Application {

    public static void main(String[] args) {
        Blade blade = Blade.of();
        TaleLoader.init(blade);
        blade.use(new CsrfMiddleware()).start(Application.class, args);
    }

}
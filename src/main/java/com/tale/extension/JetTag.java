package com.tale.extension;

import com.blade.kit.StringKit;
import jetbrick.template.runtime.JetTagContext;

import java.io.IOException;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
public class JetTag {

    public static void social(JetTagContext ctx, String name) throws IOException {
        String value = Commons.site_option("social_" + name);
        if (StringKit.isNotBlank(value)) {
            value = ctx.getBodyContent();
        }
        ctx.getWriter().print(value.toString());
    }

}

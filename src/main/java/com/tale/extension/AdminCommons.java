package com.tale.extension;

import com.tale.bootstrap.TaleConst;
import com.tale.model.dto.Types;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
public final class AdminCommons {

    public static String attachURL(){
        return Commons.site_option(Types.ATTACH_URL, Commons.site_url());
    }

    public static int maxFileSize(){
        return TaleConst.MAX_FILE_SIZE / 1024;
    }

    public static String cdnURL(){
        return Commons.site_option(Types.CDN_URL, "/static/admin");
    }

    public static String siteTheme() {
        return Commons.site_theme();
    }

}

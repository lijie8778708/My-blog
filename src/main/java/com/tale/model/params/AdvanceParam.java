package com.tale.model.params;

import lombok.Data;

/**
 * @author Jie Li
 * @date 2020/6/3
 */
@Data
public class AdvanceParam {

    private String cacheKey;
    private String blockIps;
    private String pluginName;
    private String cdnURL;
    private String allowInstall;
    private String allowCommentAudit;
    private String allowCloudCDN;

}

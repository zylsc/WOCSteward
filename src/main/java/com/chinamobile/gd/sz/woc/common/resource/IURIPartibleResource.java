package com.chinamobile.gd.sz.woc.common.resource;

/**
 * Created by lishicong on 2017/5/11.
 * 资源URI可以进行拆分的资源
 */
public interface IURIPartibleResource {
    String getProtocol();
    String getHost();
    String getAbsolutePath();
    String getPath();
    String getName();
    String getPrimaryName();
    String getExtendName();
}

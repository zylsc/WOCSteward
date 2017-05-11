package com.chinamobile.gd.sz.woc.common.resource;

/**
 * Created by lishicong on 2017/5/11.
 * 资源可以陈述其状态等
 */
public interface IStateableResource {
    boolean exists();
    boolean canRead();
    boolean canWrite();
    long lastModify();
}

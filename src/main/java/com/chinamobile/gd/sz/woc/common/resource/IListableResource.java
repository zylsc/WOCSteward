package com.chinamobile.gd.sz.woc.common.resource;

import java.util.List;

/**
 * Created by lishicong on 2017/5/11.
 * 资源可以把包含的子资源列举出来
 */
public interface IListableResource<T> {
    List<T> list();
}

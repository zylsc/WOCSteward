package com.chinamobile.gd.sz.woc.common.resource;

/**
 * Created by lishicong on 2017/5/11.
 * 本地文件资源
 */
public interface IFileResource extends IDeletableResource, IListableResource<IFileResource>, IMakableResource, IStateableResource, IStreamResource, IURIPartibleResource{
    boolean isFile();
    boolean isDirectory();
}

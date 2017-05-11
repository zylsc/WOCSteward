package com.chinamobile.gd.sz.woc.common.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lishicong on 2017/5/11.
 * 可以获得I/O流程的资源
 */
public interface IStreamResource {
    InputStream getInputStream() throws IOException;
    OutputStream getOutputStream() throws IOException;
}

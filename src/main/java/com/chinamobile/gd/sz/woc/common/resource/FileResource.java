package com.chinamobile.gd.sz.woc.common.resource;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lishicong on 2017/5/11.
 * 文件资源
 */
public class FileResource implements IFileResource {
    private final File file;

    public FileResource(String uri) {
        file = new File(uri);
    }

    public boolean make() {
        return file.exists() || file.mkdirs();
    }

    public boolean clear() {
        if (exists()) {
            File[] files = file.listFiles();
            if (files == null) {
                return false;
            }

            for (File file: files) {
                boolean succ = delete(file);
                if (!succ) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private boolean delete(File file) {
        if (file.isDirectory()) {
            boolean succ = delete(file);
            if (!succ) {
                return false;
            }
        }

        return file.delete();
    }

    public boolean delete() {
       return clear() && file.delete();
    }

    public boolean exists() {
        return file.exists();
    }

    public String getProtocol() {
        return "file";
    }

    public List<IFileResource> list() {
        List<IFileResource> resources = new LinkedList<IFileResource>();

        String[] files = file.list();
        if (files == null) {
            return null;
        }

        for (String file: files) {
            resources.add(new FileResource(file));
        }

        return resources;
    }

    public String getHost() {
        return null;
    }

    public boolean canRead() {
        return file.canRead();
    }

    public String getAbsolutePath() {
        return file.getAbsolutePath();
    }

    public boolean canWrite() {
        return file.canWrite();
    }

    public String getPath() {
        return file.getPath() + File.separator;
    }

    public long lastModify() {
        return file.lastModified();
    }

    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

    public String getName() {
        return file.getName();
    }

    public boolean isFile() {
        return file.isFile();
    }

    public String getPrimaryName() {
        String name = file.getName();
        return name.substring(0, name.lastIndexOf("."));
    }

    public boolean isDirectory() {
        return file.isDirectory();
    }

    public OutputStream getOutputStream() throws IOException {
        return new FileOutputStream(file);
    }

    public String getExtendName() {
        String name = file.getName();
        return name.substring(name.lastIndexOf(".") + 1);
    }
}

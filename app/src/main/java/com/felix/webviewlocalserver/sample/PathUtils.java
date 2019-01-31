package com.felix.webviewlocalserver.sample;

import android.content.Context;

import java.io.File;

/**
 * Created by chaichuanfa on 2018/2/2.
 */

public final class PathUtils {

    private PathUtils() {
    }

    public static String getExternalFilesDir(Context context, String dirName) {
        File dir = context.getExternalFilesDir(null);
        if (dir == null) {
            dir = context.getFilesDir();
        }
        String footDir = dir.getAbsolutePath();
        File file = new File(footDir + File.separator + dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}

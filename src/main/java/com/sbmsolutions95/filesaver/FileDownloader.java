package com.sbmsolutions95.filesaver;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

public class FileDownloader {
    public static void downloadDocs(Context context, String fileName, String extension, String destinationDir, String url) {
        DownloadManager manager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(destinationDir, "SBM Labs/Docs/" + fileName + extension);
        manager.enqueue(request);
    }
}

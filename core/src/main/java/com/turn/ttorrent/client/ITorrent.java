package com.turn.ttorrent.client;

/**
 * Created by Andri on 24.08.2016.
 */
public interface ITorrent {

    public byte[] getInfoHash();
    public long getUploaded();
    public long getDownloaded();
    public long getLeft();
}
package com.ldxiaofeng.android.uipractice;

/**
 * Created by 13178 on 2018-6-13.
 */

public class Msg {

    public static final int TYPE_RECEIVED=0;
    public static final int TYPE_SENT=1;
    private String content;//消息内容
    private int type;
    public Msg(String content,int type){
        this.content=content;
        this.type=type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }


}

package com.xts.commit.https;

import com.xts.commit.bean.ShouYeBean;

public interface CallBack {
    void ok(ShouYeBean shouYeBean);
    void no(String s);
}

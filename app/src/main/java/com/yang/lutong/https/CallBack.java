package com.yang.lutong.https;

import com.yang.lutong.bean.ShouYeBean;

public interface CallBack {
    void ok(ShouYeBean shouYeBean);
    void no(String s);
}

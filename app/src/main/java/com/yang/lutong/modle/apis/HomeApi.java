package com.yang.lutong.modle.apis;

import com.yang.lutong.bean.ShouYeBean;

public interface HomeApi {
    interface View {
        void HomeDataReturn(ShouYeBean shouYeBean);

        void showErroe(String s);
    }
    interface Percenter{
        void getHomeData(int page , int size);
    }
}

package com.xts.commit.modle.apis;

import com.xts.commit.bean.ShouYeBean;

public interface HomeApi {
    interface View {
        void HomeDataReturn(ShouYeBean shouYeBean);

        void showErroe(String s);
    }
    interface Percenter{
        void getHomeData(int page , int size);
    }
}

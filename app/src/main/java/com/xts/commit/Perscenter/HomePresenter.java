package com.xts.commit.Perscenter;

import com.xts.commit.modle.apis.HomeApi;
import com.xts.commit.bean.ShouYeBean;
import com.xts.commit.https.CallBack;
import com.xts.commit.modle.HomeDemo;

public class HomePresenter {

    private final HomeApi.View view;
    private final HomeDemo homeDemo;

    public HomePresenter(HomeApi.View view) {
        this.view = view;
        homeDemo = new HomeDemo();
    }

    public void getData() {
        homeDemo.getData(new CallBack() {
            @Override
            public void ok(ShouYeBean shouYeBean) {
                view.HomeDataReturn(shouYeBean);
            }

            @Override
            public void no(String s) {
                view.showErroe(s);
            }
        });
    }


}

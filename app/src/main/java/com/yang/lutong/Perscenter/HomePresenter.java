package com.yang.lutong.Perscenter;

import com.yang.lutong.modle.apis.HomeApi;
import com.yang.lutong.bean.ShouYeBean;
import com.yang.lutong.https.CallBack;
import com.yang.lutong.modle.HomeDemo;

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

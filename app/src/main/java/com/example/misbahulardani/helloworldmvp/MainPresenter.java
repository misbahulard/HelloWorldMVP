package com.example.misbahulardani.helloworldmvp;

import android.view.View;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;
    private MainModel mModel;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}

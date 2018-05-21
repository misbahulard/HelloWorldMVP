package com.example.misbahulardani.helloworldmvp;

import android.view.View;

/**
 * Created by Misbahul Ardani on 5/21/2018.
 */

public interface MainContract {
    interface View {
        void initView();

        void setViewData(String data);
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

    interface Model {
        String getData();
    }
}

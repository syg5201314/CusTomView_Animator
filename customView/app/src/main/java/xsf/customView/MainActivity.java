package xsf.customView;

import android.view.View;

import xsf.customView.base.BaseActvity;

public class MainActivity extends BaseActvity {

    @Override
    protected int setLayoutResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        IfindViewById(R.id.btn_qqhealth).setOnClickListener(this);
        IfindViewById(R.id.btn_more).setOnClickListener(this);
        IfindViewById(R.id.btn_stateliteMenu).setOnClickListener(this);
        IfindViewById(R.id.btn_search).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_qqhealth:
                launchActvity(TestActivity1.class);
                break;
            case R.id.btn_stateliteMenu:
                launchActvity(StatelliteActivity.class);
                break;
            case R.id.btn_more:
                launchActvity(TestActivity3.class);
                break;
            case R.id.btn_search:
                launchActvity(TestActivity4.class);
                break;

        }
    }
}

package com.love.hades.hadeswegev.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.love.hades.hadeswegev.app.utils.SalaryUtils;


public class MainActivity extends Activity {


    @Bind(R.id.tv_salary_info)
    TextView tvSalaryInfo;

    private int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        tvSalaryInfo.setText(SalaryUtils.getEndDay()+"天");
    }


}

package com.rebone.pcareborn;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ConditionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        // 뒤로가기 버튼
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());

        // 맞춤 재활 시작하기 버튼 클릭 시 분석 화면으로 이동
        findViewById(R.id.btnStartCustomRehab).setOnClickListener(v -> {
            Intent intent = new Intent(this, AnalysisActivity.class);
            startActivity(intent);
        });
    }
}
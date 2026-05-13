package com.rebone.pcareborn;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AnalysisActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);

        // 뒤로가기 버튼
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());

        // 재활 치료 종료하기 버튼 클릭 시 피드백 화면으로 이동
        findViewById(R.id.btnStopRehab).setOnClickListener(v -> {
            Intent intent = new Intent(this, FeedbackActivity.class);
            startActivity(intent);
        });

        // 관절 각도 카드(cardAngle) 클릭 시 피드백 화면으로 이동
        findViewById(R.id.cardAngle).setOnClickListener(v -> {
            Intent intent = new Intent(this, FeedbackActivity.class);
            startActivity(intent);
        });
    }
}
package com.rebone.pcareborn;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RehabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rehab, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // '시작' 버튼 클릭 시 ConditionActivity로 이동
        View btnStart = view.findViewById(R.id.btnStartRehab1);
        if (btnStart != null) {
            btnStart.setOnClickListener(v -> {
                Intent intent = new Intent(getActivity(), ConditionActivity.class);
                // 메인 페이지(MainActivity)로 가지 않도록 명확하게 ConditionActivity를 타겟팅
                startActivity(intent);
            });
        }
    }
}
package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HakkindaFragment extends Fragment {
    private TextView textViewHakkinda;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,
                             Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_hakkinda, viewGroup, false);
        textViewHakkinda =  inflate.findViewById(R.id.textViewHakkinda);
        textViewHakkinda.setMovementMethod(new ScrollingMovementMethod());
        textViewHakkinda.setText("Uygulamanın asıl amacı günlük" +
                " hayatta en çok karşılaştığımız küçük ama can sıkıcı " +
                "problemlerin pratik çözümlerini göstermek." +
                "\n\n" +
                "Uygulamada geliştirmemi isteğiniz yada beğenmediğiniz kısımları" +" bana mail olarak atabilirsiniz." +
                "\n\n" +
                "Uygulamayı Sunan : Nergül Kahya " +
                "\n" +
                "Mail :");
        return inflate;
    }
}
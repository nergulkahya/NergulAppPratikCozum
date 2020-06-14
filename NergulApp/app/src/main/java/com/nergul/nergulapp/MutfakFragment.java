package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MutfakFragment extends Fragment {
    private TextView textViewMutfak;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,
                             Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mutfak, viewGroup, false);
        textViewMutfak =  inflate.findViewById(R.id.textViewMutfak);
        textViewMutfak.setMovementMethod(new ScrollingMovementMethod());
        textViewMutfak.setText("Mutfak İle İlgili 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Hazırladığınız kekin üzerine eritilmiş çikolata dökeceğiniz zaman, çikolataya biraz tereyağı katın. Sonucunda hem lezzet verir hem de çikolatayı yumuşatır." +"\n"+
                "2-) Kek kalıbınızın içine hamurunuzu dökmeden önce ortasına bir şerit alüminyum folyo koyun. Böylece kekinizi pişirdikten sonra kolayca çıkarabilirsinız." +"\n"+
                "3-) Bayatlamış ekmeklerin üzerine su serpin ve folyo kağıda sarıp 5-10 dakika fırınlayın. Böylece taptaze olacaktır." +"\n"+
                "4-) Patlıcanları pişirmeden önce tuzlayın ve bir süre bekletin. Daha sonra soğuk sütten geçirin ve kurulayın. Patlıcanlar daha lezzetli olacaktır. " +"\n"+
                "5-) Tart hamuru açarken hamurun sertleşmemesi ve kıvamının bozulmaması için; hamuru bir naylon poşete koyup merdane ile yuvarlayarak açın." +"\n"+
                "6-) Fırında patates yapmadan önce 10-15 dakika haşlayın ve çatalla delin. Böylece daha kolay pişecektir." +"\n"+
                "7-) Kahvaltı ya da çay saati için hazırladığınız hamur kızartmalarının daha lezzetli olmasını istiyorsanız, hamura eklediğiniz kabartma tozuna biraz toz şeker katın." +"\n"+
                "8-) Sebzelerinizi tuzlu suda yikamayi aliskanlik haline getirin. Tuzlu su, sebzeleri daha etkili ve çabuk temizler." +"\n"+
                "9-) Kuru fasulyeleri dağılmadan pişirmek istiyorsanız tuzu ve salçayı ya da domatesleri fasulyeler yarı piştikten sonra koyun." +"\n"+
                "10-)Maydanozdan daha fazla yararlanmak için saplarını da kullanın. Maydanoz saplarını atmayıp iyice temizledikten sonra çorbalarda kullanabilirsiniz.");
        return inflate;
    }
}
package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class SaglikFragment extends Fragment {
    private TextView textViewSaglik;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,
                             Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_saglik, viewGroup, false);
        textViewSaglik =  inflate.findViewById(R.id.textViewSaglik);
        textViewSaglik.setMovementMethod(new ScrollingMovementMethod());
        textViewSaglik.setText("Sağlık İle İlgili 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Uyumakta zorluk çekiyorsanız gözlerinizi hızlı bir şekile 1 dk boyunca kırpın." +"\n"+
                "2-) Yatmanıza rağmen hala başınız dönüyorsa bir ayağınızı yere koyun böylece beyniniz pozisyonunuzu yeniden hesaplayacaktır.." +"\n"+
                "3-) Migreniniz var ise ellerinizi uzlu suya koyup esnetin." +"\n"+
                "4-) Sineğin ısırdığı yerin kaşınmasını önlemek için üzerine deodarant sıkın " +"\n"+
                "5-) Uykulu hisediyorsanız nefesinizi tutabildiğiniz kadar tutup bırakın " +"\n"+
                "6-) Gece burnunuz tıkandığında yanınızda bir yere soğan koyun." +"\n"+
                "7-) boğaz ağrısını hafifletmek için yumuşak şekerlemelerden yiyin." +"\n"+
                "8-) Dişiniz ağrıdığında baş parmağınız yada işaret parmağınız arasında buz ovalarsanız ağrı %50 azalacaktır." +"\n"+
                "9-) Boğazınızda gıcık olduğunda kulağınızı kaşıyın." +"\n"+
                "10-)Kalp atışınızı yavaşlatmak için baş parmağınızı ağzınıza sokup üfleyin.");
        return inflate;
    }
}
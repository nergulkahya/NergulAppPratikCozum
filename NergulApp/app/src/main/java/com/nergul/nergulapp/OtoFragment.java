package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OtoFragment extends Fragment {
    private TextView textViewOtomobil;
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,
                             Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_otomobil, viewGroup, false);
        textViewOtomobil =  inflate.findViewById(R.id.textViewOtomobil);
        textViewOtomobil.setMovementMethod(new ScrollingMovementMethod());
        textViewOtomobil.setText("Otomobil Kullananlar İçin 10 Pratik Bilgi" +
                "\n\n" +
                "1-) Güneşte bekleyen aracınızı hızla soğutmak içinön camlardan birini açın ve sonrasında karşılılı kapıları kapatıp açın.Bu sayede sıcak hava dışarıya çıkacak." +"\n"+
                "2-) Arabanızdaki küçük çizikler için aynı renkteki oje ile 2-3 kat sürerek kurtulabilirsiniz ön cam çatlağı için şeffaf oje işinizi görür.Oje küçük çatlakların büyümesini engeller." +"\n"+
                "3-) Arabanıza önceden yapıştırdığınız yapıştırmaları çıkarmak için bir parça gazete kağıdına ılık suya batırın ve ardından stikerlar üzerinde 10 - 15 dk bekletin." +"\n"+
                "4-) Soğuk kış günlerinde donan kilidi açmak için bir miktar antibakteriyel jeli kilidesürün buz kolayca eriyecektir." +"\n"+
                "5-) Far lambalarını diş macunu ile temizlerseniz pırıl pırıl olduğunu göreceksiniz." +"\n"+
                "6-) Dar garajlarda kapıların çizilmesini engellemek için denizde kullanılan köpük çubukları ikiye bölerek duvara sabitleyin." +"\n"+
                "7-) Telefonunuzu sabitlemek için arabanızın klima kanalına lastik geçirip telefonunuzu sabitlediğinizden emin olun." +"\n"+
                "8-) Bir çorabın içine kedi kumu koyup arabaya koyarsanız camların buğulu olmasını engelleyecektir çünkü kedi kumu nemi içine çeker." +"\n"+
                "9-) İçtiğimiz coco cola 'yı arabanızdaki paslara süungerin yumuşak tarafıyla uygularsanız pas problemi ortadan kalkacaktır." +"\n"+
                "10-)Mutfak pompasına ve arabadaki küçük göçük olan yere sıcak su döküp pompayı göçüğe pastırıp itme çekme işlemi ile küçük göçüklerden kurtulabilirsiniz.");

        return inflate;
    }
}
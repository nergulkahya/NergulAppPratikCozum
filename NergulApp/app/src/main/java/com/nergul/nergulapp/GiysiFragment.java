package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GiysiFragment extends Fragment {
    private TextView textViewGiysi;
        @Override
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup,
                Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.fragment_giysiler, viewGroup, false);
            textViewGiysi =  inflate.findViewById(R.id.textViewGiysi);
            textViewGiysi.setMovementMethod(new ScrollingMovementMethod());
            textViewGiysi.setText("Kıyafetler İçin 10 Pratik Bilgi" +
                    "\n\n" +
                    "1-) Kazak ve yazlık kıyafetlerde en büyük sıkıntı iplikler,onlardan kurtulmak için o minik ipliğin ucuna bir ip bağlayıp daha sonra ipiği iğneye geçirip kıyafetin altına çekin" +"\n"+
                    "2-) Düğme dikmek için iğne ipliğiniz yok ise ataç veya çengelli iğne ile anlık sorununuzu çözebilirsiniz." +"\n"+
                    "3-) Pantolonunuzun düğmesini kapatamadığınız zaman lastik tokadan yararlanabilirsiniz üzerinede bol bir tişört giyip anlık çözüm üretmiş olursunuz." +"\n"+
                    "4-) Sürekli açılan fermuarınız için ise fermuar ucuna bir halka takıp düğmeye geçirirseniz hiç bir sorun kalmayacaktır.." +"\n"+
                    "5-) Acil kurutmanız gereken kıyafetleriniz için kıyafetinizi kuru bir havluya sarın yuvarlayıp üzerine basın ,bütün fazla nemi çekecektir.." +"\n"+
                    "6-) Yaz günlerinde kıyafetinizde oluşan deodarant lekelerini geçirmek için kıyafatinizi makinaya atmadan önce çamaşır sodası ve sıcak su karışımında en az 1-2 saat bekletin ve lekelerden kurtulun." +"\n"+
                    "7-) Eğer spordan çıktıktan sonra kıyafetlerinizi hemen yıkamadıysanız kokunun geçmesi çok zor olur bundan kurtulmak için beyaz sirke ve suyu karıştırıp içerisinde 1-2 saat bekletip makinaya atınız." +"\n"+
                    "8-) Kıyafetlerinizdeki çamaşır suyu lekesi için ispirtolu kalemle kurtulabilirsiniz ancak kıyafetiniz koyu renkli olmalıdır." +"\n"+
                    "9-) Kilotlu çoraplardaki küçük ten kaçmalarında renksiz ojeyi kaçık olan yere sürüp birleşmesini sağlamak ." +"\n"+
                    "10-)Kıyafetinize dökülen kırmızı şarap lekesini beyaz şarap ile veya sirke ile çıkarabilirsiniz.");
            return inflate;
    }
}
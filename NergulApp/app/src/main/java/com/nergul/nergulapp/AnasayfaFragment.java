package com.nergul.nergulapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AnasayfaFragment extends Fragment {
    private ImageButton imageButtonYemek;
    private ImageButton imageButtonOtomobil;
    private ImageButton imageButtonGiysi;
    private ImageButton imageButtonSaglik;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_anasayfa,viewGroup,false);
        imageButtonGiysi=inflate.findViewById(R.id.imageButtonGiysi);
        imageButtonOtomobil=inflate.findViewById(R.id.imageButtonOtomobil);
        imageButtonSaglik=inflate.findViewById(R.id.imageButtonSaglik);
        imageButtonYemek=inflate.findViewById(R.id.imageButtonYemek);

        imageButtonGiysi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Kıyafetler Hakkında");
                builder.setMessage("Acil durumlarda saç düzleştiricisi ütü olarakta kullanılabilir." +
                        "\n"+"Parfümü bitmiş küçük parfüm şişelerini atmaya kıyamıyorsanız onları çamaşır dolabınıza koyun. Böylece çamaşırlarınızın hoş kokmasını sağlarsınız." +
                        "\n"+"Elbisenize sakız yapışırsa, naylon torbanın içerisinde buzluğa koyun Bir saat bekletin ve çıkartın. Kolayca çıkacaktır.");
                builder.setPositiveButton("Anlaşıldı.", null);
                builder.create().show();
            }
        });

        imageButtonYemek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Yemekler Hakkında");
                builder.setMessage("Peyniri kolay rendelemek için, 15 dakika buzlukta bekletin.." +
                        "\n"+"Kurabiyelerinizin kurumasını engellemek için yanına bir dilim ekmek koyabilirsiniz" +
                        "\n"+"Kavanoz kapağına streç film yerleştirin ve harcınızı elinizle yerleştirin, köfteniz dışarıda yedikleriniz gibi olacaktır.");
                builder.setPositiveButton("Anlaşıldı.", null);
                builder.create().show();
            }
        });

        imageButtonOtomobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Otomobiller ve Eğlence Hakkında");
                builder.setMessage("Kağıt havlu rulosu, raptiye ve makas kullanarak; birkaç dakikada pratik bir hoparlör yapabilirsiniz." +
                        "\n"+"Birisi asansörün bütün düğmelerine mi bastı?Düğmelere yeniden basarsanız bazı asansörlerde istenmeyen katların düğmeleri kapanıyor.");
                builder.setPositiveButton("Anlaşıldı.", null);
                builder.create().show();
            }
        });
        imageButtonSaglik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Sağlık ve Temizlik Hakkında");
                builder.setMessage("Evinizin mis gibi kokmasını istiyorsanız, bir kaç tane karanfili az su ile kaynatın." +
                        "\n"+"Halıya sakız yapışırsa üzerinde buz torbası gezdirin..");
                builder.setPositiveButton("Anlaşıldı.", null);
                builder.create().show();
            }
        });
        return inflate;
    }
}
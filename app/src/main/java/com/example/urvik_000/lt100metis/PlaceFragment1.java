package com.example.urvik_000.lt100metis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceFragment1 extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.place_layout, container, false);

        // Bundle bundle = new Bundle();
        savedInstanceState = getArguments();
        int x = savedInstanceState.getInt("index");
        setPlace(x);

        return myView;
    }



    public void setPlace(int index){
        TextView tv = myView.findViewById(R.id.tw1);
        ImageView iv = myView.findViewById(R.id.imageView);
        TextView tv2 = myView.findViewById(R.id.tw2);

        switch (index){
            case 0: tv2.setText("Spaudos rūmai");
                tv.setText("        1991 – ųjų sausį, panaudojant ginkluotąsias pajėgas ir vietinius kolaborantus, Lietuvoje mėginta atkurti sovietų politinę valdžią. Planuota pirmiausia atkirsti Lietuvą nuo pasaulio, užgrobiant televizijos, radijo, spaudos pastatus, o vėliau kėsintis į parlamentą. Spaudos rūmai pastatyti 1985 m. 1991 m. sausio 11 d. sovietų kariuomenė jėga juos užgrobė. Užgrobimo metu automatu apšaudyta fasadinė rūmų siena. Tačiau Lietuvos žmonių ryžtas gintis sustabdė agresiją.");
                iv.setImageResource(R.drawable.spaudosrumai);
                break;
            case 1: tv2.setText("Televizijos bokštas");
                tv.setText("        Vilniaus Televizijos bokštas yra aukščiausias statinys šalyje ir teisėtai užima garbingą vietą tarp aukščiausių pasaulio televizijos bokštų, kurio aukštis – 326,5 metrai. TV bokšte įrengta Sausio 13-osios muziejinė ekspozicija – Laisvės kovų muziejus, kuris mena kruvinus 1991 m. sausio 13-osios nakties įvykius, kurių metu prie TV bokšto žuvo 12 žmonių: Loreta Asanavičiūtė, Virginijus Druskis, Darius Gerbutavičius, Rolandas Jankauskas, Rimantas Juknevičius, Algimantas Petras Kavoliukas, Vidas Maciulevičius, Titas Masiulis, Apolinaras Juozas Povilaitis, Ignas Šimulionis, Vytautas Vaitkus, Vytautas Koncevičius. Gynėjų žuvimo vietas dabar mena prie TV bokšto pastatyti nedideli granito obeliskai ir šalia pasodinti medžiai.");
                iv.setImageResource(R.drawable.tvbokstas);
                break;
            case 2: tv2.setText("Vingio parkas");
                tv.setText("        Labai didelę įtaką Lietuvos nepriklausomybės akto atkūrimui padarė Lietuvos Persitvarkymo Sąjūdžio mitingai skirti Lietuvos delegatams paremti, pasisakyti prieš melą oficialiojoje spaudoje bei paminėti tautai svarbias datas. Didžiausias mitingas įvyko liepos 9 d. Vingio parke, į kurį susirinko apie 100 tūkst. žmonių iš daugelio Lietuvos miestų ir rajonų. Sąjūdžio Iniciatyvinė grupė buvo nutarusi, kad tą dieną reikia juridiškai įteisinti trispalvę. Reaguodama į Sąjūdžio reikalavimą dėl trispalvės įteisinimo, valdžia nutarė ją legalizuoti, apie tai mitingo metu pareiškė A. M. Brazauskas. Mitingo pabaigoje tūkstančiai žmonių pagiedojo V. Kudirkos „Tautišką giesmę“, kurios tekstas jiems buvo išdalintas. Mitingas parodė, kad niekaip negalima ignoruoti Sąjūdžio, už kurio nugaros jau buvo tūkstantinės minios ir visi suprato, jog įvyko lūžis ir Lietuvos nepriklausomybė - tik laiko klausimas. Taip pat Vingio parke kas ketverius metus  organizuojama Lietuvos dainų šventė, kurios tradiciją ir simboliką UNESCO pripažino Žmonijos žodinio ir nematerialaus kultūros paveldo šedevru. Į Baltijos šalis dainų švenčių tradicija atėjo per Baltijos vokiečius – pirmiausia į Estiją, Latviją, kiek vėliau – ir į Lietuvą. Masiniai tautų susibūrimai per dainų ir šokių šventės renginius skatino tautų bendrumo ir vienybės jausmą, kūrė prielaidas ateityje Baltijos tautoms atsiskirti nuo Rusijos ir sukurti (o Lietuvai – atkurti) savarankiškas valstybes.");
                iv.setImageResource(R.drawable.vingioparkas);
                break;
        }
    }
}

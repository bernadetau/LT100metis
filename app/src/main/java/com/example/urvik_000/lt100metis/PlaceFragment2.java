package com.example.urvik_000.lt100metis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceFragment2 extends Fragment{
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
            case 0: tv2.setText("Didysis getas");
                tv.setText("        Didysis Vilniaus getas egzistavo nuo 1941 m. iki 1943 m.. Didžiajame gete buvo apie 29 000 žydų, kurių didžioji dalis nužudyta Paneriuose. Tarpukariu Vilniuje žydai sudarė apie trečdalį visų gyventojų. Per Antrąjį pasaulinį karą naciai Lietuvoje, dažnai padedami lietuvių kolaborantų, išžudė 90 proc. iš daugiau kaip 200 tūkst. Lietuvos žydų. Rūdninkų g. 18 – tai pagrindinių vartų į Didįjį getą vieta, kurią pažymi paminklinė lenta su geto planu. Kvartalas tarp Ašmenos, Dysnos ir Mėsinių gatvių – tai pirmasis atkuriamo istorinio Vilniaus kvartalas, čia veikia Žydų kultūros ir informacijos centras. Lietuvai atkūrus Nepriklausomybę, Didžiojo Vilniaus geto likvidavimo diena (rugsėjo 23 d.) buvo paskelbta Lietuvos žydų genocido aukų atminimo diena.");
                iv.setImageResource(R.drawable.didysisgetas);
                break;
            case 1: tv2.setText("Paminklas šv. Faustinai");
                tv.setText("        2000 m. šventąja paskelbta sesuo Faustina Kovalska 1933–1936 m. gyveno Vilniuje, Dievo Motinos Gailestingumo seserų vienuolyno namuose. Čia ji ne kartą patyrė mistinius regėjimus, pagal kuriuos, jai pačiai nuolat prižiūrint, vilnietis dailininkas Eugenijus Kazimirovskis 1934 m. nutapė garsųjį Gailestingojo Jėzaus paveikslą. Vilniuje ji sutiko ir garsųjį seserų nuodėmklausį kun. Mykolą Sopočko, padrąsinusį imtis patikėtos misijos skelbti Viešpaties Gailestingumą. Tikinčiųjų pamėgtąjį Dievo Gailestingumo vainikėlį seseriai Faustinai apsireiškęs Jėzus taip pat padiktavo Vilniuje 1935 m. rugsėjo 13–14 d. beveik stebuklo dėka išlikusiame mediniame namelyje Vilniuje, Antakalnyje, Grybo gatvėje 29a, kuriame su savo kongregacijos seserimis gyveno sesuo Faustina. 2008 m. namelis restauruotas, atkurtas autentiškas Šv. Faustinos kambarys, įrengta koplytėlė, 2013 m. Vilniaus Palaimintojo kunigo Mykolo Sopočkos hospiso vidiniame kieme buvo pastatytas Šv. Faustinos paminklas.");
                iv.setImageResource(R.drawable.faustina);
                break;
            case 2: tv2.setText("Paminklinė lenta Jonui Basanavičiui");
                tv.setText("        Jonas Basanavičius (1851–1927) – lietuvių visuomenės veikėjas, Nepriklausomybės akto signataras, gydytojas, tautosakininkas, vienas laikraščio Aušra (Auszra) steigėjų, Lietuvių mokslo draugijos įkūrimo iniciatorius, dažnai vadinamas „tautos patriarchu“. J.Basanavičius aukštino Lietuvos praeitį, domėjosi lietuvių kalbos ištakomis, rinko lietuvių tautosaką ir skatino kitus ją rinkti, sukūrė savitą lietuvių kilmės teoriją, skatino lietuvių tautinę savimonę ir žadino tėvynės meilę. Jis aktyviai dalyvavo visuomeninėje–politinėje veikloje, siekiant Lietuvos tautinio ir socialinio išsivadavimo. Jono Basanavičiaus laikinai pirmininkaujama Lietuvos Taryba 1918 m. vasario 16 d. paskelbė Lietuvos Nepriklausomybės Aktą. Dr. J.Basanavičius sulaukė beveik visų savo tautinių ir politinių svajonių išsipildymo, nors gyvendamas lenkų okupuotame Vilniuje, neregėjo suvienytos Lietuvos. Mirė Vilniuje 1927 m. vasario 16 d., palaidotas Rasų kapinėse.");
                iv.setImageResource(R.drawable.lentabasanaviciui);
                break;
            case 3: tv2.setText("Paminklas popiežiui Jonui Pauliui II");
                tv.setText("        Karolis Józefas Wojtyła (1920 - 2005), nuo 1978 m. spalio mėnesio popiežius Jonas Paulius II. Popiežius Jonas Paulius II buvo plačiai pripažintas vienu įtakingiausiu XX a. lyderiu, ypač svarbia asmenybe griūvant komunizmui Rytų Europoje. Popiežiaus Jono Pauliaus II pontifikatas susijęs su dvasiniu lietuvių tautos atgimimu. Jonas Paulius II buvo pirmasis istorijoje popiežius, aplankęs Lietuvą, taip pat Baltijos kaimynes, Latviją ir Estiją. Šio atmintino lankymosi metu 1993 m. rugsėjo 4 –8 d. Šventasis Tėvas savo sveikinimo žodžius, homilijas bei kalbas sakė daugiausia lietuviškai, taip pat Lietuvoje gyvenančių tautų kalbomis. Šventojo Tėvo vizitas tapo svarbia Bažnyčios bei šalies istorine data ir patvirtino, kad padėtis buvusioje Sovietų Sąjungos šalyje kinta. Sostinėje įsikūrusioje Apaštališkojoje nunciatūroje buvo pašventintas paminklas, skirtas popiežiui Jonui Pauliui II.");
                iv.setImageResource(R.drawable.paminklaspopieziui);
                break;
            case 4: tv2.setText("LR prezidentūra");
                tv.setText("        Lietuvos Respublikos Prezidentūra – LR prezidento rezidencija ir darbo vieta, esanti Vilniaus senamiestyje, prie Vilniaus universiteto, S. Daukanto a. 3. Prezidentūra yra įsikūrusi XIX a. vėlyvojo klasicizmo stiliaus dviaukščiuose rūmuose. Pirmasis Lietuvos Prezidentas A. Smetona ėjo pareigas iki 1920 m. birželio 19 d. Prezidento institucija gyvavo visą tarpukarį iki 1940 m. kai, šalį okupavus Sovietų Sąjungai, buvo panaikinta. XX a. pabaigoje Lietuvai atstačius Nepriklausomybę įvyko konstitucinis referendumas, buvo priimta Konstitucija, kurioje buvo įteisinta Lietuvos prezidento institucija. Pirmuoju atkurtos Lietuvos prezidentu 1993 m. visuotiniu šalies piliečių balsavimu buvo išrinktas Algirdas Brazauskas.");
                iv.setImageResource(R.drawable.prezidentura);
                break;
            case 5: tv2.setText("Paminklas Cemachui Šabadui");
                tv.setText("        Populiariausias Vilniaus žydų lyderis XX a. pirmojoje pusėje buvo dr. Cemachas Šabadas (1864–1935). Jis buvo labai veiklus įvairiose srityse – labdaros, sveikatingumo, švietimo, mokslo ir kt. Didžiulę šlovę C. Šabadas pelnė profesine veikla. Apie jį – gydytoją galime spręsti iš to, kad rašytojas Kornejus Čukovskis populiarą pasaką “Daktaras Aiskauda” parašė, pasak jo paties, nusižiūrėjęs Cemachą Šabadą. Jo pastangomis buvo kuriamos labdaros organizacijos, įgyvendinami paramos projektai, skirti nepasiturinčių miesto gyventojų sveikatos priežiūrai bei gyvenimo sąlygoms gerinti.");
                iv.setImageResource(R.drawable.paminklassabadui);
                break;
            case 6: tv2.setText("Signatarų namai");
                tv.setText("        Signatarų namai – istorijos ir architektūros paminklas, kuriame 1918 metų vasario 16 dieną dvidešimt Lietuvos Tarybos narių pasirašė Lietuvos Nepriklausomybės Aktą. Po Lietuvos nepriklausomybės atgavimo, 1990 m., namas dedikuotas muziejui. Čia eksponuojami įvairūs signatarų, vėliau tapusių diplomatais, daiktai, vyksta kasmetiniai vasario 16 d. paminėjimai. Juose pirmą kartą visuomenei bus pristatytas prof. Liudo Mažylio Vokietijos Federacinės Respublikos užsienio reikalų ministerijos Politiniame archyve rastas 1918 m. vasario 16 d. Nutarimas dėl nepriklausomos Lietuvos valstybės atkūrimo. Dokumentas nuo 2018 m. sausio 21d. iki 2018 m. lapkričio 15 d. bus eksponuojamas tose pačiose patalpose, kur ir buvo pasirašytas. ");
                iv.setImageResource(R.drawable.signatarunamai);
                break;
            case 7: tv2.setText("Vilniaus Vytauto Didžiojo gimnazija");
                tv.setText("        Vilniaus Vytauto Didžiojo gimnaziją 1915m. įkūrė Mykolas Biržiška, Jonas Basanavičius ir Povilas Gaidelionis. Visą šimtmetį gimnazijai teko kęsti lenkų, rusų ar nacių draudimus, daug kartų keisti mokyklos patalpas ir pavadinimą. Be to, keitėsi gimnazijos statusas ir paskirtis. Iš pradžių ji buvo berniukų gimnazija, vėliau priimtos mokytis ir mergaitės, po kelerių metų atskirtos berniukų ir mergaičių gimnazijos ir taip toliau. Taigi gimnazijos istorija buvo kupina įvairiausių sunkumų, pasikeitimų ir išbandymų. Tačiau mokyklos vadovai visokeriopai stengėsi ją išsaugoti ir, nors patiems teko daug paaukoti, jie pasiekė savo tikslą. Didžiausias jų nuopelnas yra tai, kad visą šimtmetį mokykloje buvo dėstoma lietuvių kalba. Taip pat svarbu paminėti, kad gimnazijoje dirbo tokie žymūs ir garbūs žmones kaip Antanas Smetona, Aleksandras Stulginskis ir kitos iškilios Lietuvos asmenybės.");
                iv.setImageResource(R.drawable.vvdg);
                break;
            case 8: tv2.setText("Paminklas Jonui Žemaičiui");
                tv.setText("        Jonas Žemaitis (1909 - 1954) Lietuvos karininkas, rezistentas, partizanų vadas, dimisijos brigados generolas. Jono Žemaičio, buvusios Karo mokyklos auklėtinio, pastangomis 1949 m. buvo galutinai suvienytas Lietuvos partizaninis judėjimas, o jis pats 1949 m. vasario mėn. išrinktas Lietuvos laisvės kovos sąjūdžio Tarybos prezidiumo pirmininku ir ėjo Respublikos prezidento pareigas. 1949 m. J. Žemaičiui suteiktas laisvės kovotojų – partizanų generolo laipsnis. Partizaniniam judėjimui jis vadovavo iki 1953 m. gegužės 30 d., kai dėl išdavystės, įmetus į bunkerį granatą su migdomosiomis dujomis, buvo apsvaigintas ir suimtas. 1954 m. birželio mėn. uždarame teisme J. Žemaitis buvo nuteistas mirties bausme. Sušaudytas lapkričio 26 d. Maskvoje.");
                iv.setImageResource(R.drawable.paminklaszemaiciui);
                break;
        }
    }
}

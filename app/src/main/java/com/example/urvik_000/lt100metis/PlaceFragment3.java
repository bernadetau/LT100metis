package com.example.urvik_000.lt100metis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceFragment3 extends Fragment{
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
            case 0: tv2.setText("Paminklas Vladui Jurgaičiui");
                tv.setText("        Vilniaus centre, prie Lietuvos banko pastato, 2015 m. pabaigoje atidengtas paminklas pirmajam Lietuvos banko – prieškaryje veikusio Lietuvos Respublikos centrinio banko – valdytojui Vladui Jurgučiui. Vladas Jurgutis (1885 – 1966 m.) – viena iškiliausių tarpukario Lietuvos asmenybių, politikas, mokslininkas, pedagogas, talentingas finansininkas, nuo Lietuvos banko veiklos pradžios ir nacionalinės valiutos lito išleidimo į apyvartą septynerius metus (1922 – 1929 m.) vadovavęs mūsų šalies centriniam bankui – Lietuvos bankui – ir visai šalies pinigų politikai. Tuometinei Lietuvos pinigų sistemai jis sukūrė tvirtus pamatus, jo dėka litas tapo viena stipriausių tuometinių valiutų. Vlado Jurgučio biustas stovi ant kolonos, ant kurios pavaizduoti tarpukario Lietuvos ir dabartinių laikų litų monetų vaizdai. Šis paminklas – simbolinė padėka Lietuvos pinigų sistemos pirmtakams.");
                iv.setImageResource(R.drawable.paminklasjurgaiciui);
                break;
            case 1: tv2.setText("Paminklas Vincui Kudirkai");
                tv.setText("        Vincas Kudirka (1858–1899) Lietuvos prozininkas, poetas, publicistas ir kritikas, vertėjas, taip pat laikraščio „Varpas“ redaktorius ir vienas iš lietuvių tautinio sąjūdžio ideologų. Jis visą gyvenimą skyrė lietuvių tautai žadinti, šviesti, siekė Lietuvoje skleisti europietiškus demokratijos principus, priartinti Vakarų Europos literatūrą ir kultūrą. Kudirka sukūrė ir Lietuvos himną – „Tautišką giesmę“. XIX a. pabaigoje jaunuolis gėdijosi lietuviškos kilmės, o lenkiškoji kultūra atrodė vienintelė verta mokslus einančio žmogaus, tačiau subrendęs suprato savosios kilmės ir kalbos svarbą. 1889 m. Kudirka pradeda nelegaliai leisti mėnesinį laikraštį „Varpas“ ir jį redaguoja visą dešimtmetį, iki pat mirties. Jį liūdino lietuvių inteligentų abejingumas visuomeninei ir kultūrinei veiklai, tačiau džiaugėsi, kad vis dėlto beveik jo vieno pastangomis leistas laikraštis pasiekė pagrindinį tikslą – išgarsino Lietuvos vardą ir paskatino kitataučius viešai svarstyti lietuvių spaudos, uždraustos raštijos lietuvių kalba ir valstybingumo klausimus. Kudirka tautos atmintyje išliko kaip herojiško aukojimosi visuomenės labui pavyzdys.");
                iv.setImageResource(R.drawable.kudirka);
                break;
            case 2: tv2.setText("Skulptūra „Laisvės kelias\"");
                tv.setText("        „Laisvės kelias\" – tai skulptūra, skirta Lietuvos valstybės atkūrimo dvidešimtmečiui ir kviečianti visus šalies gyventojus bei Lietuvos patriotus tęsti laisvės ir vienybės kelią. „Laisvės kelias\" – tai kovos už nepriklausomybę atminimas ir laisvės bei vienybės simbolis ateities kartoms. Skulptūra simbolizuoja Baltijos kelią – gyvą žmonių grandinę, daugiau kaip prieš 20 metų sujungusią tris nepriklausomybės siekusias Baltijos valstybes, nusidriekusią 600 kilometrų ir tapusią analogų pasaulyje neturinčia vienybės išraiška.");
                iv.setImageResource(R.drawable.laisveskelias);
                break;
            case 3: tv2.setText("Seimo rūmai");
                tv.setText("        Seimo rūmai – Lietuvių tautos pasipriešinimo sovietinei okupacijai simbolis. 1990 m. kovo 11 d. rūmuose buvo paskelbtas aktas „Dėl Lietuvos nepriklausomos valstybės atstatymo“. 1991 m. sausio 13 d. Sovietų kariuomenės siekį užimti rūmus apgynė dešimtys tūkstančių žmonių. Šį įvykį primena atminties vieta – barikadų liekanos ir paminkliniai ženklai, tokie kaip Sausio 13-osios memorialas, kuris įamžina Lietuvos gynėjų atminimą.");
                iv.setImageResource(R.drawable.seimorumai);
                break;
            case 4: tv2.setText("Paminklas tremtiniams");
                tv.setText("        Nuo 1941 m. birželio 14 dienos Sovietų Sąjunga vykdė masinius Lietuvos gyventojų trėmimus į Sovietų Sąjungos gilumą. Lietuvos gyventojų genocido ir rezistencijos tyrimo centro duomenimis, 1940 – 1953 m. laikotarpiu iš Lietuvos buvo ištremta 131 600 žmonių. Dar apie 156 tūkst. Lietuvos gyventojų buvo įkalinta. Taigi, bendras deportuotų asmenų skaičius priartėjo prie 300 tūkst. Trėmimus vykdė specialūs NKVD daliniai. Labiausiai nukentėjo inteligentija. Buvo ištremti Lietuvos Respublikos politiniai veikėjai, partijų ir organizacijų vadovai, karininkai, gydytojai, mokytojai, ūkininkai ir jų šeimos. Šiandien paminklas Lietuvos tremtiniams, kentėjusiems ir žuvusiems Jakutijoje byloja apie visos Lietuvos tremtinių dalią, simbolizuoja Tautos kančią, dvasios stiprybę ir Viltį.");
                iv.setImageResource(R.drawable.paminklastremtiniams);
                break;
            case 5: tv2.setText("Inskripcijos sovietinių represijų aukoms");
                tv.setText("        Dabartiniuose Apygardos teismo rūmuose nacių laikais veikė gestapas, sovietinės okupacijos metais – KGB, kur buvo laikomi, kankinami ir žudomi kovotojai už Lietuvos valstybingumą. Šiuo metu čia veikia Genocido aukų muziejus, pastato fasade iškalti žuvusių rezistentų vardai, šalia pastatytas paminklas – lauko akmenų piramidė. Pastato pusrūsyje išlikęs vidaus kalėjimas – tardymo izoliatorius, kuriame nuo 1940 m. rudens iki pat 1987 m. buvo kalinami okupacinei valdžiai besipriešinantys Lietuvos gyventojai. ");
                iv.setImageResource(R.drawable.inskripcijosaukomsgedopr);
                break;
        }
    }
}

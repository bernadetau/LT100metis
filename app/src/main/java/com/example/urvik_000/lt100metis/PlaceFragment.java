package com.example.urvik_000.lt100metis;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceFragment extends Fragment{
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
            case 2: tv2.setText("Paminklas Vladui Jurgaičiui");
                tv.setText("        Vilniaus centre, prie Lietuvos banko pastato, 2015 m. pabaigoje atidengtas paminklas pirmajam Lietuvos banko – prieškaryje veikusio Lietuvos Respublikos centrinio banko – valdytojui Vladui Jurgučiui. Vladas Jurgutis (1885 – 1966 m.) – viena iškiliausių tarpukario Lietuvos asmenybių, politikas, mokslininkas, pedagogas, talentingas finansininkas, nuo Lietuvos banko veiklos pradžios ir nacionalinės valiutos lito išleidimo į apyvartą septynerius metus (1922 – 1929 m.) vadovavęs mūsų šalies centriniam bankui – Lietuvos bankui – ir visai šalies pinigų politikai. Tuometinei Lietuvos pinigų sistemai jis sukūrė tvirtus pamatus, jo dėka litas tapo viena stipriausių tuometinių valiutų. Vlado Jurgučio biustas stovi ant kolonos, ant kurios pavaizduoti tarpukario Lietuvos ir dabartinių laikų litų monetų vaizdai. Šis paminklas – simbolinė padėka Lietuvos pinigų sistemos pirmtakams.");
                iv.setImageResource(R.drawable.paminklasjurgaiciui);
                break;
            case 3: tv2.setText("Paminklas Vincui Kudirkai");
                tv.setText("        Vincas Kudirka (1858–1899) Lietuvos prozininkas, poetas, publicistas ir kritikas, vertėjas, taip pat laikraščio „Varpas“ redaktorius ir vienas iš lietuvių tautinio sąjūdžio ideologų. Jis visą gyvenimą skyrė lietuvių tautai žadinti, šviesti, siekė Lietuvoje skleisti europietiškus demokratijos principus, priartinti Vakarų Europos literatūrą ir kultūrą. Kudirka sukūrė ir Lietuvos himną – „Tautišką giesmę“. XIX a. pabaigoje jaunuolis gėdijosi lietuviškos kilmės, o lenkiškoji kultūra atrodė vienintelė verta mokslus einančio žmogaus, tačiau subrendęs suprato savosios kilmės ir kalbos svarbą. 1889 m. Kudirka pradeda nelegaliai leisti mėnesinį laikraštį „Varpas“ ir jį redaguoja visą dešimtmetį, iki pat mirties. Jį liūdino lietuvių inteligentų abejingumas visuomeninei ir kultūrinei veiklai, tačiau džiaugėsi, kad vis dėlto beveik jo vieno pastangomis leistas laikraštis pasiekė pagrindinį tikslą – išgarsino Lietuvos vardą ir paskatino kitataučius viešai svarstyti lietuvių spaudos, uždraustos raštijos lietuvių kalba ir valstybingumo klausimus. Kudirka tautos atmintyje išliko kaip herojiško aukojimosi visuomenės labui pavyzdys.");
                iv.setImageResource(R.drawable.kudirka);
                break;
            case 4: tv2.setText("Skulptūra „Laisvės kelias\"");
                tv.setText("        „Laisvės kelias\" – tai skulptūra, skirta Lietuvos valstybės atkūrimo dvidešimtmečiui ir kviečianti visus šalies gyventojus bei Lietuvos patriotus tęsti laisvės ir vienybės kelią. „Laisvės kelias\" – tai kovos už nepriklausomybę atminimas ir laisvės bei vienybės simbolis ateities kartoms. Skulptūra simbolizuoja Baltijos kelią – gyvą žmonių grandinę, daugiau kaip prieš 20 metų sujungusią tris nepriklausomybės siekusias Baltijos valstybes, nusidriekusią 600 kilometrų ir tapusią analogų pasaulyje neturinčia vienybės išraiška.");
                iv.setImageResource(R.drawable.laisveskelias);
                break;
            case 5: tv2.setText("Paminklinė lenta Jonui Basanavičiui");
                tv.setText("        Jonas Basanavičius (1851–1927) – lietuvių visuomenės veikėjas, Nepriklausomybės akto signataras, gydytojas, tautosakininkas, vienas laikraščio Aušra (Auszra) steigėjų, Lietuvių mokslo draugijos įkūrimo iniciatorius, dažnai vadinamas „tautos patriarchu“. J.Basanavičius aukštino Lietuvos praeitį, domėjosi lietuvių kalbos ištakomis, rinko lietuvių tautosaką ir skatino kitus ją rinkti, sukūrė savitą lietuvių kilmės teoriją, skatino lietuvių tautinę savimonę ir žadino tėvynės meilę. Jis aktyviai dalyvavo visuomeninėje–politinėje veikloje, siekiant Lietuvos tautinio ir socialinio išsivadavimo. Jono Basanavičiaus laikinai pirmininkaujama Lietuvos Taryba 1918 m. vasario 16 d. paskelbė Lietuvos Nepriklausomybės Aktą. Dr. J.Basanavičius sulaukė beveik visų savo tautinių ir politinių svajonių išsipildymo, nors gyvendamas lenkų okupuotame Vilniuje, neregėjo suvienytos Lietuvos. Mirė Vilniuje 1927 m. vasario 16 d., palaidotas Rasų kapinėse.");
                iv.setImageResource(R.drawable.lentabasanaviciui);
                break;
            case 6: tv2.setText("Paminklas popiežiui Jonui Pauliui II");
                tv.setText("        Karolis Józefas Wojtyła (1920 - 2005), nuo 1978 m. spalio mėnesio popiežius Jonas Paulius II. Popiežius Jonas Paulius II buvo plačiai pripažintas vienu įtakingiausiu XX a. lyderiu, ypač svarbia asmenybe griūvant komunizmui Rytų Europoje. Popiežiaus Jono Pauliaus II pontifikatas susijęs su dvasiniu lietuvių tautos atgimimu. Jonas Paulius II buvo pirmasis istorijoje popiežius, aplankęs Lietuvą, taip pat Baltijos kaimynes, Latviją ir Estiją. Šio atmintino lankymosi metu 1993 m. rugsėjo 4 –8 d. Šventasis Tėvas savo sveikinimo žodžius, homilijas bei kalbas sakė daugiausia lietuviškai, taip pat Lietuvoje gyvenančių tautų kalbomis. Šventojo Tėvo vizitas tapo svarbia Bažnyčios bei šalies istorine data ir patvirtino, kad padėtis buvusioje Sovietų Sąjungos šalyje kinta. Sostinėje įsikūrusioje Apaštališkojoje nunciatūroje buvo pašventintas paminklas, skirtas popiežiui Jonui Pauliui II.");
                iv.setImageResource(R.drawable.paminklaspopieziui);
                break;
            case 7: tv2.setText("LR prezidentūra");
                tv.setText("        Lietuvos Respublikos Prezidentūra – LR prezidento rezidencija ir darbo vieta, esanti Vilniaus senamiestyje, prie Vilniaus universiteto, S. Daukanto a. 3. Prezidentūra yra įsikūrusi XIX a. vėlyvojo klasicizmo stiliaus dviaukščiuose rūmuose. Pirmasis Lietuvos Prezidentas A. Smetona ėjo pareigas iki 1920 m. birželio 19 d. Prezidento institucija gyvavo visą tarpukarį iki 1940 m. kai, šalį okupavus Sovietų Sąjungai, buvo panaikinta. XX a. pabaigoje Lietuvai atstačius Nepriklausomybę įvyko konstitucinis referendumas, buvo priimta Konstitucija, kurioje buvo įteisinta Lietuvos prezidento institucija. Pirmuoju atkurtos Lietuvos prezidentu 1993 m. visuotiniu šalies piliečių balsavimu buvo išrinktas Algirdas Brazauskas.");
                iv.setImageResource(R.drawable.prezidentura);
                break;
            case 8: tv2.setText("Paminklas Cemachui Šabadui");
                tv.setText("        Populiariausias Vilniaus žydų lyderis XX a. pirmojoje pusėje buvo dr. Cemachas Šabadas (1864–1935). Jis buvo labai veiklus įvairiose srityse – labdaros, sveikatingumo, švietimo, mokslo ir kt. Didžiulę šlovę C. Šabadas pelnė profesine veikla. Apie jį – gydytoją galime spręsti iš to, kad rašytojas Kornejus Čukovskis populiarą pasaką “Daktaras Aiskauda” parašė, pasak jo paties, nusižiūrėjęs Cemachą Šabadą. Jo pastangomis buvo kuriamos labdaros organizacijos, įgyvendinami paramos projektai, skirti nepasiturinčių miesto gyventojų sveikatos priežiūrai bei gyvenimo sąlygoms gerinti.");
                iv.setImageResource(R.drawable.paminklassabadui);
                break;
            case 9: tv2.setText("Seimo rūmai");
                tv.setText("        Seimo rūmai – Lietuvių tautos pasipriešinimo sovietinei okupacijai simbolis. 1990 m. kovo 11 d. rūmuose buvo paskelbtas aktas „Dėl Lietuvos nepriklausomos valstybės atstatymo“. 1991 m. sausio 13 d. Sovietų kariuomenės siekį užimti rūmus apgynė dešimtys tūkstančių žmonių. Šį įvykį primena atminties vieta – barikadų liekanos ir paminkliniai ženklai, tokie kaip Sausio 13-osios memorialas, kuris įamžina Lietuvos gynėjų atminimą.");
                iv.setImageResource(R.drawable.seimorumai);
                break;
            case 10: tv2.setText("Signatarų namai");
                tv.setText("        Signatarų namai – istorijos ir architektūros paminklas, kuriame 1918 metų vasario 16 dieną dvidešimt Lietuvos Tarybos narių pasirašė Lietuvos Nepriklausomybės Aktą. Po Lietuvos nepriklausomybės atgavimo, 1990 m., namas dedikuotas muziejui. Čia eksponuojami įvairūs signatarų, vėliau tapusių diplomatais, daiktai, vyksta kasmetiniai vasario 16 d. paminėjimai. Juose pirmą kartą visuomenei bus pristatytas prof. Liudo Mažylio Vokietijos Federacinės Respublikos užsienio reikalų ministerijos Politiniame archyve rastas 1918 m. vasario 16 d. Nutarimas dėl nepriklausomos Lietuvos valstybės atkūrimo. Dokumentas nuo 2018 m. sausio 21d. iki 2018 m. lapkričio 15 d. bus eksponuojamas tose pačiose patalpose, kur ir buvo pasirašytas. ");
                iv.setImageResource(R.drawable.signatarunamai);
                break;
            case 11: tv2.setText("Spaudos rūmai");
                tv.setText("        1991 – ųjų sausį, panaudojant ginkluotąsias pajėgas ir vietinius kolaborantus, Lietuvoje mėginta atkurti sovietų politinę valdžią. Planuota pirmiausia atkirsti Lietuvą nuo pasaulio, užgrobiant televizijos, radijo, spaudos pastatus, o vėliau kėsintis į parlamentą. Spaudos rūmai pastatyti 1985 m. 1991 m. sausio 11 d. sovietų kariuomenė jėga juos užgrobė. Užgrobimo metu automatu apšaudyta fasadinė rūmų siena. Tačiau Lietuvos žmonių ryžtas gintis sustabdė agresiją.");
                iv.setImageResource(R.drawable.spaudosrumai);
                break;
            case 12: tv2.setText("Paminklas tremtiniams");
                tv.setText("        Nuo 1941 m. birželio 14 dienos Sovietų Sąjunga vykdė masinius Lietuvos gyventojų trėmimus į Sovietų Sąjungos gilumą. Lietuvos gyventojų genocido ir rezistencijos tyrimo centro duomenimis, 1940 – 1953 m. laikotarpiu iš Lietuvos buvo ištremta 131 600 žmonių. Dar apie 156 tūkst. Lietuvos gyventojų buvo įkalinta. Taigi, bendras deportuotų asmenų skaičius priartėjo prie 300 tūkst. Trėmimus vykdė specialūs NKVD daliniai. Labiausiai nukentėjo inteligentija. Buvo ištremti Lietuvos Respublikos politiniai veikėjai, partijų ir organizacijų vadovai, karininkai, gydytojai, mokytojai, ūkininkai ir jų šeimos. Šiandien paminklas Lietuvos tremtiniams, kentėjusiems ir žuvusiems Jakutijoje byloja apie visos Lietuvos tremtinių dalią, simbolizuoja Tautos kančią, dvasios stiprybę ir Viltį.");
                iv.setImageResource(R.drawable.paminklastremtiniams);
                break;
            case 13: tv2.setText("Televizijos bokštas");
                tv.setText("        Vilniaus Televizijos bokštas yra aukščiausias statinys šalyje ir teisėtai užima garbingą vietą tarp aukščiausių pasaulio televizijos bokštų, kurio aukštis – 326,5 metrai. TV bokšte įrengta Sausio 13-osios muziejinė ekspozicija – Laisvės kovų muziejus, kuris mena kruvinus 1991 m. sausio 13-osios nakties įvykius, kurių metu prie TV bokšto žuvo 12 žmonių: Loreta Asanavičiūtė, Virginijus Druskis, Darius Gerbutavičius, Rolandas Jankauskas, Rimantas Juknevičius, Algimantas Petras Kavoliukas, Vidas Maciulevičius, Titas Masiulis, Apolinaras Juozas Povilaitis, Ignas Šimulionis, Vytautas Vaitkus, Vytautas Koncevičius. Gynėjų žuvimo vietas dabar mena prie TV bokšto pastatyti nedideli granito obeliskai ir šalia pasodinti medžiai.");
                iv.setImageResource(R.drawable.tvbokstas);
                break;
            case 14: tv2.setText("Inskripcijos sovietinių represijų aukoms");
                tv.setText("        Dabartiniuose Apygardos teismo rūmuose nacių laikais veikė gestapas, sovietinės okupacijos metais – KGB, kur buvo laikomi, kankinami ir žudomi kovotojai už Lietuvos valstybingumą. Šiuo metu čia veikia Genocido aukų muziejus, pastato fasade iškalti žuvusių rezistentų vardai, šalia pastatytas paminklas – lauko akmenų piramidė. Pastato pusrūsyje išlikęs vidaus kalėjimas – tardymo izoliatorius, kuriame nuo 1940 m. rudens iki pat 1987 m. buvo kalinami okupacinei valdžiai besipriešinantys Lietuvos gyventojai. ");
                iv.setImageResource(R.drawable.inskripcijosaukomsgedopr);
                break;
            case 15: tv2.setText("Vingio parkas");
                tv.setText("        Labai didelę įtaką Lietuvos nepriklausomybės akto atkūrimui padarė Lietuvos Persitvarkymo Sąjūdžio mitingai skirti Lietuvos delegatams paremti, pasisakyti prieš melą oficialiojoje spaudoje bei paminėti tautai svarbias datas. Didžiausias mitingas įvyko liepos 9 d. Vingio parke, į kurį susirinko apie 100 tūkst. žmonių iš daugelio Lietuvos miestų ir rajonų. Sąjūdžio Iniciatyvinė grupė buvo nutarusi, kad tą dieną reikia juridiškai įteisinti trispalvę. Reaguodama į Sąjūdžio reikalavimą dėl trispalvės įteisinimo, valdžia nutarė ją legalizuoti, apie tai mitingo metu pareiškė A. M. Brazauskas. Mitingo pabaigoje tūkstančiai žmonių pagiedojo V. Kudirkos „Tautišką giesmę“, kurios tekstas jiems buvo išdalintas. Mitingas parodė, kad niekaip negalima ignoruoti Sąjūdžio, už kurio nugaros jau buvo tūkstantinės minios ir visi suprato, jog įvyko lūžis ir Lietuvos nepriklausomybė - tik laiko klausimas. Taip pat Vingio parke kas ketverius metus  organizuojama Lietuvos dainų šventė, kurios tradiciją ir simboliką UNESCO pripažino Žmonijos žodinio ir nematerialaus kultūros paveldo šedevru. Į Baltijos šalis dainų švenčių tradicija atėjo per Baltijos vokiečius – pirmiausia į Estiją, Latviją, kiek vėliau – ir į Lietuvą. Masiniai tautų susibūrimai per dainų ir šokių šventės renginius skatino tautų bendrumo ir vienybės jausmą, kūrė prielaidas ateityje Baltijos tautoms atsiskirti nuo Rusijos ir sukurti (o Lietuvai – atkurti) savarankiškas valstybes.");
                iv.setImageResource(R.drawable.vingioparkas);
                break;
            case 16: tv2.setText("Vilniaus Vytauto Didžiojo gimnazija");
                tv.setText("        Vilniaus Vytauto Didžiojo gimnaziją 1915m. įkūrė Mykolas Biržiška, Jonas Basanavičius ir Povilas Gaidelionis. Visą šimtmetį gimnazijai teko kęsti lenkų, rusų ar nacių draudimus, daug kartų keisti mokyklos patalpas ir pavadinimą. Be to, keitėsi gimnazijos statusas ir paskirtis. Iš pradžių ji buvo berniukų gimnazija, vėliau priimtos mokytis ir mergaitės, po kelerių metų atskirtos berniukų ir mergaičių gimnazijos ir taip toliau. Taigi gimnazijos istorija buvo kupina įvairiausių sunkumų, pasikeitimų ir išbandymų. Tačiau mokyklos vadovai visokeriopai stengėsi ją išsaugoti ir, nors patiems teko daug paaukoti, jie pasiekė savo tikslą. Didžiausias jų nuopelnas yra tai, kad visą šimtmetį mokykloje buvo dėstoma lietuvių kalba. Taip pat svarbu paminėti, kad gimnazijoje dirbo tokie žymūs ir garbūs žmones kaip Antanas Smetona, Aleksandras Stulginskis ir kitos iškilios Lietuvos asmenybės.");
                iv.setImageResource(R.drawable.vvdg);
                break;
            case 17: tv2.setText("Paminklas Jonui Žemaičiui");
                tv.setText("        Jonas Žemaitis (1909 - 1954) Lietuvos karininkas, rezistentas, partizanų vadas, dimisijos brigados generolas. Jono Žemaičio, buvusios Karo mokyklos auklėtinio, pastangomis 1949 m. buvo galutinai suvienytas Lietuvos partizaninis judėjimas, o jis pats 1949 m. vasario mėn. išrinktas Lietuvos laisvės kovos sąjūdžio Tarybos prezidiumo pirmininku ir ėjo Respublikos prezidento pareigas. 1949 m. J. Žemaičiui suteiktas laisvės kovotojų – partizanų generolo laipsnis. Partizaniniam judėjimui jis vadovavo iki 1953 m. gegužės 30 d., kai dėl išdavystės, įmetus į bunkerį granatą su migdomosiomis dujomis, buvo apsvaigintas ir suimtas. 1954 m. birželio mėn. uždarame teisme J. Žemaitis buvo nuteistas mirties bausme. Sušaudytas lapkričio 26 d. Maskvoje.");
                iv.setImageResource(R.drawable.paminklaszemaiciui);
                break;
        }
    }
}

package com.example.urvik_000.lt100metis;

public class QuestionLibrary {

        private String Questions [] = {
                "Kiek signatarų pasirašė Lietuvos nepriklausomybės aktą?",
                "„Tautiškos giesmės“  autorius:",
                "Pirmoji lietuviška gimnazija yra",
                "Lietuvos nepriklausomybės atkūrimo aktas buvo paskelbtas"

        };


        private String Choices [][] = {
                {"21", "18", "20"},
                {"Jonas Basanavičius", "Vincas Kudirka", "Adomas Mickevičius"},
                {"Mykolo Biržiškos gimnazija", "Jėzuitų gimnazija", "Vytauto Didžiojo gimnazija"},
                {"Seimo rūmuose", "Signatarų namuose", "Prezidentūroje"}
        };



        private String CorrectAnswers[] = {"20", "Vincas Kudirka", "Vytauto Didžiojo gimnazija", "Seimo rūmai"};




        public String getQuestion(int a) {
            String question = Questions[a];
            return question;
        }


        public String getChoice1(int a) {
            String choice0 = Choices[a][0];
            return choice0;
        }


        public String getChoice2(int a) {
            String choice1 = Choices[a][1];
            return choice1;
        }

        public String getChoice3(int a) {
            String choice2 = Choices[a][2];
            return choice2;
        }

        public String getCorrectAnswer(int a) {
            String answer = CorrectAnswers[a];
            return answer;
        }

}



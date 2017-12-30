import java.util.Locale;
import java.util.Scanner;

    public class QuizMatematyczny{
        public static void main(String[] args) {
            final String appName = "Quiz matematyczny v0.1 by Aleksander Szlachcic";

            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.US);

            MathQuiz mathQuiz = new MathQuiz();

            double n = 0; //ilosc poprawnych odpowiedzi to zmienna n - usprawnienie programu numer 1 poniżej
            char c = '%'; //wynik procentowy oraz liczenie poprawnych odpowiedzi- usprawnienie programu numer 2 poniżej
            int rezultat = 0;

            System.out.println(appName + "\n");
            System.out.println("Pytanie 1: Jaki jest wynik mnożenia 3*5 ?");
            double wynik1 = input.nextDouble();
            input.nextLine();

            System.out.println("Pytanie 2: Jakie jest pole kwadratu o boku 12 ?");
            double wynik2 = input.nextDouble();
            input.nextLine();

            System.out.println("Pytanie 3: Jaki jest pierwiastek kwadratowy z liczby 15129 ?");
            double wynik3 = input.nextDouble();
            input.nextLine();
            System.out.println();

                if (mathQuiz.question1(wynik1)) {
                    System.out.println("Twoja odpowiedź na pytanie 1 jest prawidłowa!");
                    n++;
                    rezultat++;
                } else {
                    System.out.print("Twoja Odpowiedź na pytanie 2 jest błędna gdyż odpowiedziałeś: " + wynik1);
                    System.out.println(", prawidłowa odpowiedź to: 15");
                }
                if (mathQuiz.question2(wynik2)){
                        System.out.println("Twoja odpowiedź na pytanie 2 jest prawidłowa!");
                        n++;
                        rezultat++;
                    } else {
                        System.out.print("Twoja Odpowiedź na pytanie 2 jest błędna gdyż odpowiedziałeś: " + wynik2);
                        System.out.println(", prawidłowa odpowiedź to: 144");
                    }

            if (mathQuiz.question3(wynik3)){
                        System.out.println("Twoja odpowiedź na pytanie 3 jest prawidłowa!");
                        n++;
                        rezultat++;
                    } else {
                        System.out.print("Twoja Odpowiedź na pytanie 3 jest błędna gdyż odpowiedziałeś: " + wynik3);
                        System.out.println(", prawidłowa odpowiedź to: 123");
                    }

                    System.out.println();
                    System.out.printf("Liczba poprawnych odpowiedzi to: %.0f/3 \n", n);
                    System.out.printf("Twój wynik procentowy to: %.2f%s ", (n/3)*100, c);

                            switch (rezultat) {
                                case 0:
                                    System.out.println("\nNiestety nie udało Ci się odpowiedzieć na żadne pytanie poprawnie - możesz spróbować ponownie.");
                                    break;
                                case 3:
                                    System.out.println("\nGratulacje!!! Odpowiedziałeś poprawnie na wszystkie 3 pytania.");
                                    break;
                                default:
                                    System.out.println("\nZawsze możesz spróbować jeszcze raz, żeby poprawić wynik.");
                            }

                    input.close();
        }
    }
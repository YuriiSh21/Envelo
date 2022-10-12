import java.util.Objects;
import java.util.Scanner;

public class Main {
    static String cmd;

    public static void main(String[] args) {

        int a = 2;
        int[] num = {5, 4, 3, 2, 1};

        solution1A();
        solution1B();
        kanyeRest(listOfQuotes());
        System.out.println(search(num, a));   // złożoność obliczeniową - to O(log (N))
    }

    private static boolean search(int[] numbers, int x) {
        if (x <= numbers[0] && x >= numbers[numbers.length - 1]) {

            int firstIndex = 0;
            int lastIndex = numbers.length - 1;

            while (firstIndex <= lastIndex) {
                int middleIndex = (firstIndex + lastIndex) / 2;
                if (numbers[middleIndex] == x) {
                    return true;
                } else if (numbers[middleIndex] > x)
                    firstIndex = middleIndex + 1;

                else if (numbers[middleIndex] < x)
                    lastIndex = middleIndex - 1;
            }
        }
        return false;
    }

    public static Quotes listOfQuotes() {
        Quotes quotes = new Quotes();
        quotes.quotesOfKanye.add(quotes.getQuote1());
        quotes.quotesOfKanye.add(quotes.getQuote2());
        quotes.quotesOfKanye.add(quotes.getQuote3());
        quotes.quotesOfKanye.add(quotes.getQuote4());
        quotes.quotesOfKanye.add(quotes.getQuote5());
        quotes.quotesOfKanye.add(quotes.getQuote6());
        quotes.quotesOfKanye.add(quotes.getQuote7());
        quotes.quotesOfKanye.add(quotes.getQuote8());
        quotes.quotesOfKanye.add(quotes.getQuote9());
        quotes.quotesOfKanye.add(quotes.getQuote10());
        quotes.quotesOfKanye.add(quotes.getQuote11());
        quotes.quotesOfKanye.add(quotes.getQuote12());
        quotes.quotesOfKanye.add(quotes.getQuote13());
        quotes.quotesOfKanye.add(quotes.getQuote14());
        quotes.quotesOfKanye.add(quotes.getQuote15());
        return quotes;
    }

    public static void kanyeRest(Quotes quotes) {
        for (int i = 0; i < quotes.quotesOfKanye.size(); ) {
            Scanner scan = new Scanner(System.in);
            cmd = scan.nextLine();
            if (Objects.equals(cmd, "next")) {
                System.out.println(quotes.quotesOfKanye.get(i));
                i++;
            } else if (Objects.equals(cmd, "exit")) {
                break;
            } else {
                System.out.println("Wpisz właściwą komendę!");
            }
        }
        System.out.println("Do widzenia");
    }

    public static void solution1A() {
        System.out.println("Klas abstrakcyjnych używa się gdy chcemy współdzielić część kodu" +
                " pomiędzy klasami, mamy jakąś określoną hierarchię, którą chcemy odwzorować " +
                "w kodzie gdzie każdy kolejny wyższy poziom z hierarchii dziedziczy" +
                " zachowania z niższego lub dziedziczy je z niewielkimi modyfikacjami.\n" +
                "Interfejsów używa sie gdy potrzebujemy dodać jakieś zachowania " +
                "do danej klasy albo wszędzie tam, gdzie potrzebujemy różnych implementacji " +
                "tego samego interfejsu.");
    }

    public static void solution1B() {
        System.out.println("Tablica od listy liniowej różni sie tym, że tablica jest strukturą" +
                " danych zawierającą zbiór podobnych elementów danych, podczas gdy lista" +
                " łączona jest traktowana jako nieprosta struktura danych zawiera zbiór" +
                " nieuporządkowanych połączonych elementów zwanych węzłami. W tablicy elementy" +
                " należą do indeksów, tzn. Jeśli chcesz dostać się do czwartego elementu," +
                " musisz wpisać nazwę zmiennej z jej indeksem lub lokalizacją w nawiasie" +
                " kwadratowym. Na liście połączonej musisz jednak zacząć od głowy i" +
                " przepracować, aż dotrzesz do czwartego elementu. Dostęp do tablicy" +
                " elementów jest szybki, natomiast lista łączy zajmuje liniowy czas," +
                " więc jest nieco wolniejsza. Operacje takie jak wstawianie i usuwanie w" +
                " tablicach zajmują dużo czasu. Z drugiej strony wydajność tych operacji na" +
                " listach powiązanych jest szybka. Tablice mają stały rozmiar. Natomiast" +
                " listy połączone są dynamiczne i elastyczne, mogą rozszerzać i zmniejszać" +
                " swój rozmiar. W tablicy pamięć jest przypisywana podczas kompilacji," +
                " podczas gdy na liście połączonej jest przydzielana podczas wykonywania lub" +
                " w czasie wykonywania. Elementy są przechowywane kolejno w tablicach," +
                " podczas gdy są przechowywane losowo na listach połączonych. Wymóg pamięci" +
                " jest mniejszy ze względu na faktyczne dane przechowywane w indeksie w tablicy." +
                " W związku z tym istnieje zapotrzebowanie na więcej pamięci w listach" +
                " połączonych z powodu przechowywania dodatkowych, następnych i poprzednich" +
                " elementów odwołujących się. Ponadto wykorzystanie pamięci jest nieefektywne" +
                " w macierzy. Odwrotnie, wykorzystanie pamięci jest wydajne w macierzy.");
    }
}

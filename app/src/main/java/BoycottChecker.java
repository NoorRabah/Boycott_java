import java.util.*;

public class BoycottChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<LinkedList<String>> boycottedList = new ArrayList<>();

        LinkedList<String> FoodList = new LinkedList<>(Arrays.asList("burger king", "kfc", "kitkat", "twix",
                "doritos", "cheetos", "halls", "lays", "lion", "m&m's", "mcdonalds", "nesquik",
                "oreo", "pizza hut", "skittles", "snickers", "maggi"));
        boycottedList.add(FoodList);

        LinkedList<String> DrinkList = new LinkedList<>(Arrays.asList("espresso house", "nestle", "pepsi",
                "lipton", "orangina", "rani", "schweppes", "sprite", "starbucks", "tesco", "fanta", "coca-cola", "arwa"));
        boycottedList.add(DrinkList);

        LinkedList<String> CarList = new LinkedList<>(Arrays.asList("hyundai", "jaguar", "range rover", "mercedes benz"));
        boycottedList.add(CarList);

        LinkedList<String> FashionList = new LinkedList<>(Arrays.asList("zara", "ysl beauty", "tom ford beauty",
                "stella", "prada", "next", "m&s", "louis vuitton", "giorgio armani", "fendi", "dior",
                "chanel", "american eagle", "adidas"));
        boycottedList.add(FashionList);

        ArrayList<LinkedList<String>> insteadList = new ArrayList<>();

        LinkedList<String> ReasonFoodList = new LinkedList<>(Arrays.asList(
                "Supports Israeli economy", "Supports Zionist agenda", "Affiliated with Israeli companies",
                "Major sponsor of Israeli activities", "Donated to occupation forces", "Owned by pro-Israel entities",
                "Funding settlers", "Propaganda against Palestine", "Anti-BDS", "Pro-Israel ads",
                "Partnerships with Israeli businesses", "Israel-based logistics", "Supports IDF", "Israeli political donations",
                "Exporting from settlements", "Works with Israeli government", "Trade with occupied territories"
        ));
        insteadList.add(ReasonFoodList);

        LinkedList<String> ReasonDrinkList = new LinkedList<>(Arrays.asList(
                "Affiliated with Israeli companies", "Supports Zionist agendas", "Pro-Israel donations",
                "Owned by Israeli shareholders", "Funding Israeli economy", "Promoting normalization",
                "Trade with Israel", "Political support to occupation", "Anti-BDS actions", "Donated to IDF",
                "Uses Israeli ingredients", "Manufactured in settlements", "Supports Israeli lobbying"
        ));
        insteadList.add(ReasonDrinkList);

        LinkedList<String> ReasonCarList = new LinkedList<>(Arrays.asList(
                "Trade with Israel", "Partnership with Israeli companies", "Supports Israeli auto imports", "Economic support to Israel"
        ));
        insteadList.add(ReasonCarList);

        LinkedList<String> ReasonFashionList = new LinkedList<>(Arrays.asList(
                "Funding Israeli fashion industry", "Using Israeli designers", "Made in settlements",
                "Partnered with pro-Israel agencies", "Donated to Israeli causes", "Using Israeli cotton",
                "Pro-Israel campaigns", "Opened stores in occupied territories", "Exporting from Israel",
                "Supports normalization", "Pro-Israel ambassadors", "Marketing in Israel", "Israeli shareholders", "Supports IDF"
        ));
        insteadList.add(ReasonFashionList);

        System.out.println("Enter the item you want to search if it's boycotted or not from these groups (food, drinks, car, and fashion)");
        System.out.print("Enter the product here: ");
        String searchedProduct = scanner.nextLine().toLowerCase();

        boolean isBoycottItem = false;
        int n = -1, m = -1;

        for (int i = 0; i < boycottedList.size(); i++) {
            for (int j = 0; j < boycottedList.get(i).size(); j++) {
                if (boycottedList.get(i).get(j).equals(searchedProduct)) {
                    isBoycottItem = true;
                    n = j;
                    m = i;
                    break;
                }
            }
        }

        if (!isBoycottItem) {
            System.out.println("This product type is not boycotted :) , so you can buy it.");
        } else {
            System.out.println("**This product type is boycotted.**");
            System.out.println("--------------------------------------------");
            System.out.print("Do you want to know the reason for the boycott? (yes/no): ");
            String userChoose = scanner.nextLine().toLowerCase();

            if (userChoose.equals("yes")) {
                System.out.println("The reason for boycotting this product:");
                System.out.println(insteadList.get(m).get(n));
            } else {
                System.out.println("Ok. Please don't buy this product, free Palestine :)");
            }
        }

        scanner.close();
    }
}
package Ex2ConsoleApp;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Commodity commodity = new Commodity("BUTTER", 100, 50, 200);

        List<Commodity> commodityList = new ArrayList<>();
        commodityList.add(commodity);
        commodityList.add(new Commodity("BRED", 233, 144, 350));
        commodityList.add(new Commodity("MILK", 400, 200, 900));
        commodityList.add(new Commodity("CHOCOLATE", 100, 50, 175));
        commodityList.add(new Commodity("BOUNTY", 175, 75, 125));

        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            byte num = scanner.nextByte();
            switch (num) {
                case 1:
                    commodity.addCommodity(commodityList);
                    break;
                case 2:
                    commodity.removeCommodity(commodityList);
                    break;
                case 3:
                    commodity.replaceCommodity(commodityList);
                    break;
                case 4:
                    commodity.sortByName(commodityList);
                    break;
                case 5:
                    commodity.sortByHeight(commodityList);
                    break;
                case 6:
                    commodity.sortByWidth(commodityList);
                    break;
                case 7:
                    commodity.sortByWeight(commodityList);
                    break;
                case 8:
                    commodity.getCommodityByIndex(commodityList);
                    break;
                case 9:
                    commodity.showList(commodityList);
                    break;
                case 0:
                    commodity.exit(commodityList);
                    break;
                default:
                    System.out.println(num + "doesn't exist");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("?????????????? ???????????????? ??????????");
        System.out.println("1 - ?????? ???????????? ??????????");
        System.out.println("2 - ?????? ???????????????? ??????????");
        System.out.println("3 - ?????? ???????????????? ??????????");
        System.out.println("4 - ?????? ?????????????????? ?????????? ???? ????????????");
        System.out.println("5 - ?????? ?????????????????? ?????????? ???? ????????????????");
        System.out.println("6 - ?????? ?????????????????? ?????????? ???? ??????????????");
        System.out.println("7 - ?????? ?????????????????? ?????????? ???? ??????????");
        System.out.println("8 - ?????? ?????????????? ??-?????? ?????????????? ????????????????");
        System.out.println("9 - ?????? ?????????????? ?????? ????????????");
        System.out.println("0 - ?????? ??????????");

    }
}

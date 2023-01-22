package Ex2ConsoleApp;

import java.util.*;

public class Commodity {
    String name;
    int height;
    int width;
    int weight;

    public Commodity() {
    }

    public Commodity(String name, int height, int width, int weight) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commodity commodity)) return false;

        if (getHeight() != commodity.getHeight()) return false;
        if (getWidth() != commodity.getWidth()) return false;
        if (getWeight() != commodity.getWeight()) return false;
        return getName() != null ? getName().equals(commodity.getName()) : commodity.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getHeight();
        result = 31 * result + getWidth();
        result = 31 * result + getWeight();
        return result;
    }

    @Override
    public String toString() {
        return "name = " + name + ", height = " + height + ", width = " + width + ", weight = " + weight;
    }

    public void addCommodity(List<Commodity> commodityList) {
        System.out.println("Enter commodity which want to add");

        System.out.println("Enter name : ");
        Scanner scanner = new Scanner(System.in);
        String nameOfCommodity = scanner.next();

        System.out.println("Enter height : ");
        Scanner scanner2 = new Scanner(System.in);
        int height = scanner2.nextInt();

        System.out.println("Enter width : ");
        Scanner scanner3 = new Scanner(System.in);
        int width = scanner3.nextInt();

        System.out.println("Enter weight : ");
        Scanner scanner4 = new Scanner(System.in);
        int weight = scanner4.nextInt();

        commodityList.add(new Commodity(nameOfCommodity.toUpperCase(), height, width, weight));

        System.out.println("Commodity " + nameOfCommodity.toUpperCase() + " successfully added");
    }

    public void removeCommodity(List<Commodity> commodityList) {
        System.out.println("Enter commodity which want to remove");

        System.out.println("Enter name : ");
        Scanner scanner = new Scanner(System.in);
        String nameOfCommodity = scanner.next();

        System.out.println("Enter weight : ");
        Scanner scanner4 = new Scanner(System.in);
        int weight = scanner4.nextInt();

        Iterator<Commodity> iterator = commodityList.iterator();

        while (iterator.hasNext()) {
            Commodity next = iterator.next();

            if (nameOfCommodity.equalsIgnoreCase(next.getName()) && weight == next.getWeight()) {
                iterator.remove();
            }
        }
        System.out.println("Commodity " + nameOfCommodity.toUpperCase() + " successfully deleted");
    }

    public void replaceCommodity(List<Commodity> commodityList) {
        System.out.println("Enter commodity which want to replace");

        System.out.println("Enter index by element: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println("Now enter new commodity");

        System.out.println("Enter name : ");
        Scanner scanner5 = new Scanner(System.in);
        String nameOfCommodityNew = scanner5.next();

        System.out.println("Enter height : ");
        Scanner scanner6 = new Scanner(System.in);
        int heightNew = scanner6.nextInt();

        System.out.println("Enter width : ");
        Scanner scanner7 = new Scanner(System.in);
        int widthNew = scanner7.nextInt();

        System.out.println("Enter weight : ");
        Scanner scanner8 = new Scanner(System.in);
        int weightNew = scanner8.nextInt();

        Commodity c = new Commodity(nameOfCommodityNew, heightNew,widthNew,weightNew);
        commodityList.set(index,c);
    }


    public void sortByName(List<Commodity> commodityList) {
        commodityList.sort(Comparator.comparing(Commodity::getName));

        for (Commodity c : commodityList) {
            System.out.println("[ " + c + " ]");
        }
    }

    public void sortByHeight(List<Commodity> commodityList) {
        commodityList.sort(Comparator.comparing(Commodity::getHeight));

        for (Commodity c : commodityList) {
            System.out.println("[ " + c + " ]");
        }

    }

    public void sortByWidth(List<Commodity> commodityList) {
        commodityList.sort(Comparator.comparing(Commodity::getWidth));

        for (Commodity c : commodityList) {
            System.out.println("[ " + c + " ]");
        }
    }

    public void sortByWeight(List<Commodity> commodityList) {
        commodityList.sort(Comparator.comparing(Commodity::getWeight));

        for (Commodity c : commodityList) {
            System.out.println("[ " + c + " ]");
        }
    }

    public void getCommodityByIndex(List<Commodity> commodityList) {
        System.out.println("Enter index");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println(commodityList.get(index));
    }

    public void showList(List<Commodity> commodityList) {
        for (Commodity c : commodityList) {
            System.out.println("[ " + c + " ]");
        }
    }

    public void exit(List<Commodity> commodityList) {
        System.exit(0);
    }
}

package HW6;

import java.util.HashSet;
import java.util.Scanner;

public class FilterFunctions {
    // 1 pruducer
    private static HashSet<NotebookCharact> sortDataManuf(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input pruducer:  ");
        String userText = sc.nextLine().toLowerCase();
        System.out.println("searching " + userText);

        for (NotebookCharact item : dataSet) {
            if ((item.manufacture.toLowerCase()).equals(userText)) {
                result.add(item);

            }
        }
        sc.close();
        return result;
    }

    // 2 price
    private static HashSet<NotebookCharact> sortDataPrice(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Price from:  ");
        String userText = sc.nextLine();

        System.out.print("Price to:  ");
        String userText2 = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if (item.price >= Integer.parseInt(userText) && item.price <= Integer.parseInt(userText2)) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    // 3 memory
    private static HashSet<NotebookCharact> sortDataMemory(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Memory from:  ");
        String userText = sc.nextLine();

        System.out.print("Memory to:  ");
        String userText2 = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if (item.memoryValue >= Integer.parseInt(userText) && item.memoryValue <= Integer.parseInt(userText2)) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    // 4 OS
    private static HashSet<NotebookCharact> sortDataOS(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input operation system:  ");
        String userText = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if ((item.opSyst.toLowerCase()).equals(userText.toLowerCase())) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    // 5 screen size
    private static HashSet<NotebookCharact> sortDataScreenSize(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Screen size from:  ");
        String userScr = sc.nextLine();
        System.out.print("Screen size to:  ");
        String userScr2 = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if (item.screenSize >= Double.parseDouble(userScr) && item.screenSize <= Double.parseDouble(userScr2)) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    // 6 year of release

    static private HashSet<NotebookCharact> sortDataYear(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Year of release from:   ");
        String userText1 = sc.nextLine();
        System.out.println("Year of release to:   ");
        String userText2 = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if (item.yearOfRelease >= Integer.parseInt(userText1)
                    && item.yearOfRelease <= Integer.parseInt(userText2)) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    // 7 ssd volume;
    static private HashSet<NotebookCharact> sortDataSSD(HashSet<NotebookCharact> dataSet) {
        HashSet<NotebookCharact> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("SSD size from:   ");
        String userText1 = sc.nextLine();
        System.out.println("SSD size to:   ");
        String userText2 = sc.nextLine();

        for (NotebookCharact item : dataSet) {
            if (item.ssdVolume >= Integer.parseInt(userText1) && item.ssdVolume <= Integer.parseInt(userText2)) {
                result.add(item);
            }
        }
        sc.close();
        return result;
    }

    static HashSet<NotebookCharact> filterAllData(HashSet<NotebookCharact> data) {
        HashSet<NotebookCharact> result = data;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - sort by producer");
        System.out.println("2 - sort by price");
        System.out.println("3 - sort by memory size");
        System.out.println("4 - sort by operating system");
        System.out.println("5 - sort by screen size");
        System.out.println("6 - sort by year of release");
        System.out.println("7 - sort by SSD vol");
        System.out.println("0 - exit");
        System.out.println("Input the number of operation:  ");
        String userText = sc.nextLine();
        switch (userText) {
            case ("1"):
                result = sortDataManuf(result);
                break;

            case ("2"):
                result = sortDataPrice(result);
                break;

            case ("3"):
                result = sortDataMemory(result);
                break;

            case ("4"):
                result = sortDataOS(result);
                break;

            case ("5"):
                result = sortDataScreenSize(result);
                break;

            case ("6"):
                result = sortDataYear(result);
                break;

            case ("7"):
                result = sortDataSSD(result);
                break;
            default:
                System.out.println("Mistake");
                break;
        }
        if (result.isEmpty()) {
            System.out.println("No results");
        }
        sc.close();
        return result;
    }

}

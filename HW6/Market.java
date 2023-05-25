package HW6;

import java.util.HashSet;

public class Market {
    public static void main(String[] args) {
        GoodsData dataModel = new GoodsData();
        HashSet<NotebookCharact> data = dataModel.set;

        for (NotebookCharact item : data) {
            System.out.println(item.manufacture);
        }

        HashSet<NotebookCharact> sortedData = FilterFunctions.filterAllData(data);
        for (NotebookCharact item : sortedData) {
            item.printDescr();
        }

    }

}

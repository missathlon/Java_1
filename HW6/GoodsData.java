package HW6;

import java.util.HashSet;

public class GoodsData {
        public HashSet<NotebookCharact> set;

        GoodsData() {
                this.set = GoodsData.getData();
        }

        static HashSet<NotebookCharact> getData() {
                HashSet<NotebookCharact> res = new HashSet<>();
                res.add(new NotebookCharact("HP", "Victus 15-fa0129nw 6Y7X3EA", 1031, 16, "Windows", "Black", 15.6,
                                2022, 512));
                res.add(new NotebookCharact("Apple", "Air13", 1000, 16, "MacOS", "Space Gray", 13.0, 2022, 256));
                res.add(new NotebookCharact("Apple", "Pro15", 1200, 32, "MacOS", "Space Gray", 13.0, 2021, 1056));
                res.add(new NotebookCharact("Samsung", "NP750", 900, 16, "Windows", "Black", 15.0, 2020, 512));
                res.add(new NotebookCharact("Huawei", "MateBook D15 Silver (53013ERT)", 1000, 8, "Windows", "Gray",
                                15.6, 2022,
                                256));
                res.add(new NotebookCharact("Samsung", "NP900", 1250, 16, "Windows", "Gray", 15.5, 2023, 512));
                res.add(new NotebookCharact("Asus", "Vivobook Pro M1603QA-MB253", 750, 8, "Windows", "Black", 16.0,
                                2020,
                                512));
                res.add(new NotebookCharact("HP", "Pavilion 15-eg2419nw 6Y7X2EA", 890, 16, "Windows", "Gray", 15.6,
                                2020, 512));
                res.add(new NotebookCharact("Huawei", "MateBook D 15 BoDE-WDH9 53013PAB", 654, 8, "Windows", "Black",
                                15.6,
                                2021,
                                512));
                res.add(new NotebookCharact("ASUS", "Vivobook 16X M1603QA-MB097", 690, 16, "Windows", "Black", 16.0,
                                2022,
                                512));
                res.add(new NotebookCharact("Acer", "Nitro 5 AN515-46-R6ER NH.QGZEP.009", 1172, 16, "Windows", "Black",
                                15.6,
                                2022, 512));

                return res;
        }

}

package behappy;

import java.util.*;

/**
 * Created by yuwang on 2018/1/2.
 */
public class Invoice {
    public static void main(String[] args) {
        float[] invoiceArray = {213.1f, 10.1f, 150f, 110f};
        System.out.println("owned invoices: ");
        Arrays.sort(invoiceArray);
        TreeMap<Float, List<TreeSet<Float>>> mayCombinations = new TreeMap<>();
        for(float ia : invoiceArray) {
            System.out.print(ia);
            System.out.println(" ");

            Set<Float> mcKeys = new TreeSet<>(mayCombinations.keySet());
            for(Float mcKey : mcKeys) {

                Float newKey = ia + mcKey;
                List<TreeSet<Float>> newMoneyList = new ArrayList<>();
                if(mcKeys.contains(newKey)) {
                    newMoneyList.addAll(mayCombinations.get(newKey));
                }
                List<TreeSet<Float>> nowMoneyList= mayCombinations.get(mcKey);
                for(TreeSet<Float> nowMoney : nowMoneyList) {
                    TreeSet<Float> newMoney = new TreeSet<>(nowMoney);
                    newMoney.add(newKey);
                    newMoneyList.add(newMoney);
                }
                mayCombinations.put(newKey, newMoneyList);
            }
            List<TreeSet<Float>> singleMoneyList = new ArrayList<>();
            if(mayCombinations.containsKey(ia)) {
                singleMoneyList = new ArrayList<>(mayCombinations.get(ia));
            }
            TreeSet<Float> singleElement = new TreeSet<>();
            singleElement.add(ia);
            singleMoneyList.add(singleElement);
            mayCombinations.put(ia, singleMoneyList);
        }
        Set<Float> mcKeys = mayCombinations.keySet();
        for(Float mcKey : mcKeys) {
            System.out.print("may amount：");
            System.out.println(mcKey);
            System.out.print("amount may combinations: ");
            for(TreeSet<Float> mayCombination : mayCombinations.get(mcKey)) {
                System.out.println(mayCombination);
            }
        }
    }
}

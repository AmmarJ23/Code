// Name             : Ammar bin Jamalludin
// Matric No.       : A21EC0160
// Course - Section : SECJ2154 - 06
// Title            : Assignment Week 7 (ArrayList)

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<String> sName =  new ArrayList<>();

        // sName.add("alice");
        // sName.add("bob");
        // sName.add(new Integer(10).toString());

        // System.out.println(sName);
        // System.out.println("Array List Size : " + sName.size());
        


        ArrayList <Double> townsTemp = new ArrayList<>();

        townsTemp.add(27.2);
        townsTemp.add(25.3);
        townsTemp.add(23.2);
        townsTemp.add(28.9);
        townsTemp.add(29.9);
        townsTemp.add(23.1);
        townsTemp.add(24.8);
        townsTemp.add(28.5);
        townsTemp.add(29.6);
        townsTemp.add(21.5);
        townsTemp.add(23.4);
        townsTemp.add(25.8);
        townsTemp.add(26.4);
        townsTemp.add(27.8);
        townsTemp.add(26.7);

        System.out.println(townsTemp.size());

        //find highest
        Double highest = townsTemp.get(0);
        
        for (int i = 0; i < townsTemp.size(); i++) {
            if (highest < townsTemp.get(i))
            {
                highest = townsTemp.get(i);
            }
        }          
        

        //find lowest
        Double lowest = townsTemp.get(0);
        for (int i = 0; i < townsTemp.size(); i++) {
            if (lowest > townsTemp.get(i))
            {
                lowest = townsTemp.get(i);
            }
        }

        //get average
        Double avg;
        Double sum = 0.0;
        for (Double t : townsTemp) {
            sum+= t;
        }
        avg = sum / 15;

        //Print all values found
        System.out.println("Highest Temperature : " + highest);
        System.out.println("Lowest Temperature  : " + lowest);
        System.out.println("Average temperature : " + avg);

        //--------------------------------Class Implementation---------------------------------//

        ArrayList <TempRecord> townList = new ArrayList<>();

        townList.add(new TempRecord("New York", 18.5, "Partly cloudy"));
        townList.add(new TempRecord("Los Angeles", 25.3, "Sunny"));
        townList.add(new TempRecord("London", 9.2, "Rainy"));
        townList.add(new TempRecord("Paris", 12.7, "Mostly cloudy"));
        townList.add(new TempRecord("Tokyo", 17.8, "Rainy"));
        townList.add(new TempRecord("Sydney", 22.6, "Sunny"));
        townList.add(new TempRecord("Toronto", 13.4, "Cloudy"));
        townList.add(new TempRecord("Dubai", 33.9, "Clear"));
        townList.add(new TempRecord("Moscow", 5.6, "Snowy"));
        townList.add(new TempRecord("Mumbai", 29.1, "Humid"));
        townList.add(new TempRecord("Cape Town", 20.8, "Windy"));
        townList.add(new TempRecord("Shanghai", 23.2, "Hazy"));
        townList.add(new TempRecord("Rio de Janeiro", 29.5, "Partly cloudy"));
        townList.add(new TempRecord("Berlin", 11.1, "Foggy"));
        townList.add(new TempRecord("Singapore", 28.4, "Thunderstorms"));

        //get highest
        TempRecord highestElement = townList.get(0);
        for (int i = 0; i < townList.size(); i++) {
            TempRecord currTown = townList.get(i);
            if(highestElement.getTemperature() < currTown.getTemperature())
            {
                highestElement = townList.get(i);
            }
        }

        //get highest
        TempRecord lowestElement = townList.get(0);
        for (int i = 0; i < townList.size(); i++) {
            TempRecord currTown = townList.get(i);
            if(lowestElement.getTemperature() > currTown.getTemperature())
            {
                lowestElement = townList.get(i);
            }
        }

        //get average
        Double sumList = 0.0;
        Double avgList = 0.0;
        for (TempRecord tR : townList) {
            sumList+= tR.getTemperature();
        }

        avgList = sumList / townList.size();

        //print out values
        // System.out.println(townList.toString());
        System.out.println("\nTown with highest temperature: " + highestElement.toString());
        System.out.println("Town with lowest temperature: " + lowestElement.toString());
        System.out.println("Average temperature: " + avgList);


        for (int i = 0; i < townList.size(); i++) {
            TempRecord tempObj = townList.get(i);

            if(tempObj == highestElement)
            {
                townList.get(i).setRemark("Highest Temperature");
            }
            else if(tempObj == lowestElement)
            {
                townList.get(i).setRemark("Lowest Temperature");
            }
            else
            {
                if(tempObj.getTemperature() == avgList)
                {
                    townList.get(i).setRemark("About Average");
                }
                else if(tempObj.getTemperature() < avgList)
                {
                    townList.get(i).setRemark("Below Average");
                }
                else
                {
                    townList.get(i).setRemark("Above Average");
                } 
            }


        }
        System.out.println(townList.toString());
    }
}
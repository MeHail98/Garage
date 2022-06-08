package util.charStream;

import model.entity.vehicles.Automobile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class VehicleStream {
    public static void writeAutomobiles (Automobile[] automobiles, String fileName) {
        Writer writer = null;

        try{
            writer = new BufferedWriter(new FileWriter(fileName));

            for (Automobile automobile: automobiles){
                writer.write(automobile.getWeight());
                writer.write(automobile.getPassengerSeats());
                writer.write(automobile.getMaxSpeed());
            }
            writer.flush();

        } catch(IOException exception){
            System.err.println(exception);
        }finally{
            try{
                if (writer!=null){
                    writer.close();
                }
            }catch(IOException exception){

            }
        }
    }
}

import java.util.Date;

/**
 * Represents a service call to fix a central AC until
 */
public class WaterHeater extends ServiceCall{

    // A water heater service call needs an address, date service requested, description of the problem, and the age of the water heater. Resolved service calls also need the resolved date, description of the resolution, and the fee charged to the customer.
    private Integer age;
    private static Double extraWaterFee = 20.00;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, Integer age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public static Double getExtraWaterFee() { return extraWaterFee; }

    public static void setExtraWaterFee(Double extraWaterFee) {
        WaterHeater.extraWaterFee = extraWaterFee;  // why not this? because it's static?
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String extraString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(extraWaterFee);


        return "Central AC Unit Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + "\n" +
                "Mandatory City Fee = " + extraString;

    }
}


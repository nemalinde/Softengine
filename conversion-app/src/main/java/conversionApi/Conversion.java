package conversionApi;

public class Conversion {
    private final String fromUnit;
    private final String toUnit;
    private final long valueToConvert; 

    public Conversion(String fromUnit, String toUnit, long valueToConvert) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.valueToConvert = valueToConvert;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }
    
    public long getValueToConvert(){
        return valueToConvert;
    }
    
    public double kilometersMilesConversion(){
        if (this.getFromUnit().equals("kilometre")){
            return this.getValueToConvert() * 0.621371;
        }
        else{
            return this.getValueToConvert() / 0.621371;
        }
    
    }
}
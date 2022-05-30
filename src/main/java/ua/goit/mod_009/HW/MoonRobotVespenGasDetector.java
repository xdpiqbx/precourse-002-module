package ua.goit.mod_009.HW;

public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density){
        return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold){
        return !cold;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold){
        return isAcidOk(acidValue, minAcid, maxAcid) && isDensityOk(density) && isTemperatureOk(cold);
    }
}

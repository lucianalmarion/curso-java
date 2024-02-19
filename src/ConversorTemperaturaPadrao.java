public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double temperaturaCelcius) {
        return (temperaturaCelcius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}

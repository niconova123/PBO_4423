class Cpu {
    double price;

    class Processor {
        double processor_Core;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    protected class RAM {
        double memori;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}
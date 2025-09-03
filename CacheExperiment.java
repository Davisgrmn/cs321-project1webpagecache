public class CacheExperiment {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int cacheSize = Integer.parseInt(args[0]);
        int numWebpages = Integer.parseInt(args[1]);
        double stndrdDev =  Double.parseDouble(args[2]);
        int debugLvl = Integer.parseInt(args[3]);

        if (args.length == 5) {
            int seed = Integer.parseInt(args[4]);
        }




    }

}

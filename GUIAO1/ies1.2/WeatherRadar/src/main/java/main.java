import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Scanner;

public class main {

    private static Logger logger = LogManager.getLogger(main.class);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        logger.info("Scanner created.");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory. create ())
                .build();
        logger.info("Retrofit build.");
        IpmaService service = retrofit.create(IpmaService.class);
        int inicial;
        System.out.println(("CityID: "));
        inicial=sc.nextInt();main
        Call<IpmaCityForecast> callSync = service.getForecastForACityByName("Aveiro");
        logger.debug("Get forecast for a city.");
        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();
            //System.out.println(forecast);
            System. out .println( "max temp for today: " + forecast.getData().
                    listIterator().next().getTMax());
            System. out .println( "min temp for today: " + forecast.getData().
                    listIterator().next().getTMin());
            System. out .println( "date  today: " + forecast.getData().
                    listIterator().next().getForecastDate());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

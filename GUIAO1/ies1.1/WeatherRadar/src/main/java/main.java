import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory. create ())
                .build();
        IpmaService service = retrofit.create(IpmaService.class);
        int inicial;
        System.out.println(("CityID: "));
        inicial=sc.nextInt();
        Call<IpmaCityForecast> callSync = service.getForecastForACity(inicial);
        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();
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
